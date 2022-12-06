package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

	private DataSource ds;

	public ActivityDao(DataSource ds) {
		this.ds = ds;
	}

	public void saveActivity(Activity activity) {
		try (Connection conn = ds.getConnection();
			 PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_description, activity_type) values (?, ?, ?")) {
			stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
			stmt.setString(2, activity.getDescription());
			stmt.setString(3, activity.getType().toString());
		} catch (SQLException se) {
			throw new IllegalStateException("cannot query!", se);
		}
	}

	public void saveActivities(List<Activity> activities) {
		try (Connection conn = ds.getConnection();
			 PreparedStatement stmt = conn.prepareStatement("insert into activities (start_time, activity_description, activity_type) values (?, ?, ?);")) {
			for (Activity activity: activities) {
				stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
				stmt.setString(2, activity.getDescription());
				stmt.setString(3, activity.getType().toString());
				stmt.executeUpdate();
			}
		} catch (SQLException se) {
			throw new IllegalStateException("Cannot insert", se);
		}
	}

	public List<Activity> listAllActivities() {
		List<Activity> res = new ArrayList<>();
		try (Connection conn = ds.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from activities;")) {
			while (rs.next()) {
				int foundId = rs.getInt("id");
				LocalDateTime foundTimeStamp = rs.getTimestamp("start_time").toLocalDateTime();
				String foundDesc = rs.getString("activity_description");
				ActivityType foundType = ActivityType.valueOf(rs.getString("activity_type"));
				res.add(new Activity(foundId, foundTimeStamp, foundDesc, foundType));
			}
		} catch (SQLException se) {
			throw new IllegalStateException("Cannot query from database", se);
		}
		return res;
	}
}
