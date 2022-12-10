package day03;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class SchoolRepository {

	private JdbcTemplate jdbcTemplate;

	public SchoolRepository(DataSource dataSource){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public long insertSchoolWithoutStudents(School school){
		KeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplate.update(conn->{
			PreparedStatement ps = conn.prepareStatement("insert into schools (school_name,city) values(?,?)", Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,school.getSchoolName());
			ps.setString(2,school.getCity());
			return ps;
		}, holder);

		return holder.getKey().longValue();
	}

	public School findSchoolById(long id){
		return jdbcTemplate.query("select school_name, city from schools where id = ?",
				(rs, rowNum) -> new School(rs.getString("school_name"),rs.getString("city")),id).get(0);
	}

	public List<School> findSchoolsByCity(String city){
		return jdbcTemplate.query("select school_name, city from schools where city = ?",
				(rs, rowNum)-> new School(rs.getString("school_name"),rs.getString("city")),city);
	}

	public List<School> findAllSchool() {
		return jdbcTemplate.query("select id, school_name, city from schools ",
				(rs, rowNum) -> new School(rs.getLong("id"),rs.getString("school_name"),rs.getString("city")));
	}

	public School findSchoolWithMostStudents() {
		return jdbcTemplate.query("select school_name, city , COUNT(s.id ) as count from schools left join students s on schools.id = s.school_id group by school_id ORDER BY count desc limit 1",
				(rs,rn)->new School(rs.getString("school_name"),rs.getString("city"))).get(0);

	}
}
