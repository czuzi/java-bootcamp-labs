package activitytracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ActivityTrackerMain {

	public static void main(String[] args) {

		List<Activity> activities = new ArrayList<>();
		Activity activity1 = new Activity(LocalDateTime.of(2021, 2, 22, 15, 35), "futás a parkban", ActivityType.RUNNING);
		activities.add(activity1);
		Activity activity2 = new Activity(LocalDateTime.of(2020, 8, 10, 11, 12), "Egész héten Zemplén!!!", ActivityType.HIKING);
		activities.add(activity2);
		Activity activity3 = new Activity(LocalDateTime.of(2020, 10, 2, 8, 15), "egész napos bicótúra", ActivityType.BIKING);
		activities.add(activity3);
		Activity activity4 = new Activity(LocalDateTime.of(2021, 1, 22, 9, 46), "meccs az iskola tornatermében", ActivityType.BASKETBALL);
		activities.add(activity4);
		Activity activity5 = new Activity(LocalDateTime.of(2020, 12, 22, 7, 52), "kis kör a tó körül", ActivityType.RUNNING);
		activities.add(activity5);

		MysqlDataSource ds = new MysqlDataSource();
		ds.setUrl("jdbc:mysql://localhost/activitytracker?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		ds.setUser("activitytracker");
		ds.setPassword("activitytracker");

		ActivityTrackerMain main = new ActivityTrackerMain();
//		saveActivities(activities, ds);
		List<Activity> activityListFromQuery = main.listAllActivities(ds);
		System.out.println(activityListFromQuery.stream().map(Activity::getDescription).toList());

		for (Activity activity : activityListFromQuery) {
			main.findActivityById(ds, activity.getId());
		}
	}

	private Optional<Activity> findActivityById(DataSource dataSource, int id) {
		try (Connection conn = dataSource.getConnection();
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
			String description = rs.getString("description");
			ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
			Activity activity = new Activity(foundId, startTime, description, type);
			rs.close();
			return Optional.of(activity);
		} else {
			rs.close();
			return Optional.empty();
		}
	}

	private List<Activity> listAllActivities(DataSource ds) {
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

	private static void saveActivities(List<Activity> activities, MysqlDataSource ds) {
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
}
