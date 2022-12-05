package activitytracker;

import javax.sql.DataSource;
import java.sql.*;

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
}
