package activitytracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
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

	@Test
	void testSaveActivityWithTrackPointsEverythingIsOK() {
		TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
		TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
		TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 18.5472280);
		TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
		TrackPoint trackPoint5 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302552, 18.5472312);
		List<TrackPoint> trackPoints = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4, trackPoint5);
		Activity activity = new Activity(LocalDateTime.of(2020, 12, 14, 15, 30), "laza délutáni futás", ActivityType.RUNNING, trackPoints);

		dao.saveActivityAndTrackPoints(activity);
		Activity expected = dao.findActivityWithTrackPointsById(6);

		assertEquals(activity.getStartTime(), expected.getStartTime());
		assertEquals(activity.getDescription(), expected.getDescription());
		assertEquals(activity.getType(), expected.getType());
		assertEquals(activity.getTrackPoints().size(), expected.getTrackPoints().size());
		assertEquals(expected.getTrackPoints(), trackPoints);
	}

	@Test
	void testSaveActivitywithTrackPointsSomethingIsWrong() {
		TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
		TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
		TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 15238.5472280);
		TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
		List<TrackPoint> trackPoints = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4);
		Activity activity = new Activity(LocalDateTime.of(2020, 12, 14, 15, 30), "laza délutáni futás", ActivityType.RUNNING, trackPoints);

		assertThrows(IllegalStateException.class, () -> dao.saveActivityAndTrackPoints(activity), "Transaction failed");

		assertThrows(IllegalArgumentException.class, () -> dao.findActivityWithTrackPointsById(6), "No activity with this id.");
	}
}