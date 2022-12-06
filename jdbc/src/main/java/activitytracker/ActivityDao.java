package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ActivityDao {

	private DataSource ds;

	public ActivityDao(DataSource ds) {
		this.ds = ds;
	}

	public void saveActivity(Activity activity) {
		try (Connection conn = ds.getConnection();
			 PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_description, activity_type) values (?, ?, ?);")) {
			setStatementParametersForActivity(activity, stmt);
			stmt.executeUpdate();
		} catch (SQLException se) {
			throw new IllegalStateException("cannot query!", se);
		}
	}

	public Activity saveActivityAndReturnKey(Activity activity) {
		try (Connection conn = ds.getConnection();
			 PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_description, activity_type) values (?, ?, ?);",
		Statement.RETURN_GENERATED_KEYS)) {
			setStatementParametersForActivity(activity, stmt);
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				return new Activity(rs.getInt(1), activity.getStartTime(), activity.getDescription(), activity.getType());
			}
			throw new IllegalStateException("Cannot get generated key");
		} catch (SQLException sqle) {
			throw new IllegalStateException("Cannot update");
		}
	}

	private void setStatementParametersForActivity(Activity activity, PreparedStatement stmt) throws SQLException {
		stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
		stmt.setString(2, activity.getDescription());
		stmt.setString(3, activity.getType().toString());
	}

	public void saveActivities(List<Activity> activities) {
		try (Connection conn = ds.getConnection();
			 PreparedStatement stmt = conn.prepareStatement("insert into activities (start_time, activity_description, activity_type) values (?, ?, ?);")) {
			for (Activity activity: activities) {
				setStatementParametersForActivity(activity, stmt);
				stmt.executeUpdate();
			}
		} catch (SQLException se) {
			throw new IllegalStateException("Cannot insert", se);
		}
	}

	public List<Activity> listAllActivities() {

		try (Connection conn = ds.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from activities;")) {
			return getActivities(rs);
		} catch (SQLException se) {
			throw new IllegalStateException("Cannot query from database", se);
		}
	}

	private List<Activity> getActivities(ResultSet rs) throws SQLException {
		List<Activity> res = new ArrayList<>();
		while (rs.next()) {
			int foundId = rs.getInt("id");
			LocalDateTime foundTimeStamp = rs.getTimestamp("start_time").toLocalDateTime();
			String foundDesc = rs.getString("activity_description");
			ActivityType foundType = ActivityType.valueOf(rs.getString("activity_type"));
			res.add(new Activity(foundId, foundTimeStamp, foundDesc, foundType));
		}
		return res;
	}

	public Optional<Activity> findActivityById(int id) {
		try (Connection conn = ds.getConnection();
			 PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?;")) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			return getResult(rs);
		} catch (SQLException sqle) {
			throw new IllegalStateException("Cannot query.", sqle);
		}
	}
	private Optional<Activity> getResult(ResultSet rs) throws SQLException {
		if (rs.next()) {
			int foundId = rs.getInt("id");
			LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
			String description = rs.getString("activity_description");
			ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
			Activity activity = new Activity(foundId, startTime, description, type);
			rs.close();
			return Optional.of(activity);
		} else {
			rs.close();
			return Optional.empty();
		}
	}

	public void saveActivityAndTrackPoints(Activity activity) {
		try (Connection conn = ds.getConnection()) {
			conn.setAutoCommit(false);
			try {
				int activityId = saveActivityWithTrackPoints(activity, conn);
				saveTrackPoints(activityId, activity, conn);
				conn.commit();
			} catch (Exception ex) {
				conn.rollback();
				throw new IllegalStateException("Transaction failed");
			}
		} catch (SQLException sqle) {
			throw new IllegalStateException("Cannot connect");
		}
	}

	private int saveActivityWithTrackPoints(Activity activity, Connection conn) throws SQLException {
		int activityId = 0;
		try (PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_description, activity_type) values (?, ?, ?);",
				Statement.RETURN_GENERATED_KEYS)) {
			setStatementParametersForActivity(activity, stmt);
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				activityId = rs.getInt(1);
			}
			return activityId;
		}
	}

	private void saveTrackPoints(int activityId, Activity activity, Connection conn) throws SQLException {
		try (PreparedStatement stmt = conn.prepareStatement("insert into track_point(id, tp_time, lat, lon) values (?, ?, ?, ?);")) {
			for (TrackPoint t : activity.getTrackPoints()) {
				if (t.getLat() < -90.0 || t.getLat() > 90.0 || t.getLon() < -180 || t.getLon() > 180.0) {
					throw new IllegalArgumentException("Not suitable values for latitude or longitude!");
				}
				stmt.setInt(1, activityId);
				stmt.setDate(2, Date.valueOf(t.getTime()));
				stmt.setDouble(3, t.getLat());
				stmt.setDouble(4, t.getLon());

				stmt.executeUpdate();
			}
		}
	}

	public Activity findActivityWithTrackPointsById(int id) {
		try (Connection conn = ds.getConnection();
			 PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?;")) {
			stmt.setInt(1, id);
			return getActivityById(id, stmt, conn);
		} catch (SQLException sqle) {
			throw new IllegalStateException("Cannot select activity or trackpoints.", sqle);
		}
	}

	private Activity getActivityById(int id, PreparedStatement stmt, Connection conn) throws SQLException {
		try (ResultSet rs = stmt.executeQuery()) {
			if (rs.next()) {
				LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
				String description = rs.getString("description");
				ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
				List<TrackPoint> trackPoints = getTrackPoints(id, conn);
				return new Activity(id, startTime, description, type, trackPoints);
			}
			throw new IllegalArgumentException("No activity with this id.");
		}
	}

	private List<TrackPoint> getTrackPoints(int id, Connection conn) throws SQLException {
		try (PreparedStatement stmt = conn.prepareStatement("select * from track_point where id = ?;")) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				return loadTrackPoints(rs);
			}
		}
	}

	private List<TrackPoint> loadTrackPoints(ResultSet rs) throws SQLException {
		List<TrackPoint> trackpoints = new ArrayList<>();
		while (rs.next()) {
			trackpoints.add(extractTrackPoint(rs));
		}
		return trackpoints;
	}

	private TrackPoint extractTrackPoint(ResultSet rs) throws SQLException {
		LocalDate time = rs.getDate("tp_time").toLocalDate();
		double lat = rs.getDouble("lat");
		double lon = rs.getDouble("lon");

		return new TrackPoint(time, lat, lon);
	}
}
