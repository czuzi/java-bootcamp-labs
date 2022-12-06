package activitytracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

		Flyway fw = Flyway.configure().cleanDisabled(false).dataSource(ds).load();
		fw.clean();
		fw.migrate();

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
		dao.saveActivities(activities);
	}

	@Test
	void testFlywayMigration() {
		assertEquals(5, dao.listAllActivities().size());
	}

	@Test
	void testSaveActivity() {
		dao.saveActivity(new Activity(LocalDateTime.of(2022, 10, 22, 7, 52), "nagy kor a to korul", ActivityType.BIKING));
		assertEquals(6, dao.listAllActivities().size());
	}

	@Test
	void testFindActivityById() {
		Activity activity = dao.findActivityById(4).orElseThrow();

		assertEquals(LocalDateTime.of(2021, 1, 22, 9, 46), activity.getStartTime());
		assertEquals("meccs az iskola tornatermében", activity.getDescription());
		assertEquals(ActivityType.BASKETBALL, activity.getType());
	}

	@Test
	void testListActivities() {
		List<Activity> activities = dao.listAllActivities();

		assertEquals(5, activities.size());
		assertEquals(LocalDateTime.of(2020, 8, 10, 11, 12), activities.get(1).getStartTime());
		assertEquals("egész napos bicótúra", activities.get(2).getDescription());
		assertEquals(ActivityType.RUNNING, activities.get(4).getType());
	}

	@Test
	void testSaveActivityAndReturnGeneratedKeys() {
		Activity activity = new Activity(LocalDateTime.of(2021, 2, 23, 9, 56), "séta a kertben a napon", ActivityType.RUNNING);
		Activity expected = dao.saveActivityAndReturnKey(activity);

		assertEquals(6, expected.getId());
	}
}