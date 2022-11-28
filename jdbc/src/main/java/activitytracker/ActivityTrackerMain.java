package activitytracker;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

		saveActivities(activities, ds);
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
