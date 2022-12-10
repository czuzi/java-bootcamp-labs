package day03;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentRepository {

	private JdbcTemplate jdbcTemplate;

	public StudentRepository(DataSource dataSource){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insertStudent(Student student, long schoolId){
		jdbcTemplate.update("insert into students(student_name, student_year, school_id) values (?,?,?)", student.getName(),student.getSchoolYear(),schoolId);
	}

	public List<Student> findAllStudentsBySchool(long schoolId){
		return jdbcTemplate.query("select student_name,student_year from students where school_id = ?",
				(rs, rn)->new Student(rs.getString("student_name"),rs.getInt("student_year")),schoolId
		);
	}

	public List<Student> findStudentsByYearInSchool(int year, int schoolId) {
		return jdbcTemplate.query("select student_name, student_year from students where student_year = ? and school_id=?",
				(rs,rn)->new Student(rs.getString("student_name"),rs.getInt("student_year")),year,schoolId);
	}
}
