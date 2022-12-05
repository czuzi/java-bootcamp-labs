package activitytracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

	ActivityDao dao;

	@BeforeEach
	void init() {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setUrl("jdbc:mysql://localhost/activitytracker?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		ds.setUser("activitytracker");
		ds.setPassword("activitytracker");

		dao = new ActivityDao(ds);

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

		Flyway fw = Flyway.configure().cleanDisabled(false).dataSource(ds).load();
		fw.clean();
		fw.migrate();
	}
}