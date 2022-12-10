package day03;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

public class SchoolMain {

	public static void main(String[] args) {
		MariaDbDataSource dataSource = new MariaDbDataSource();
		try{
			dataSource.setUrl("jdbc:mariadb://localhost:3306/schooldb?useUnicode=true");
			dataSource.setUser("school");
			dataSource.setPassword("school");
		}catch (SQLException se){
			throw new IllegalStateException("Cannot connect!",se);
		}

		Flyway flyway = Flyway.configure().cleanDisabled(false).dataSource(dataSource).load();
//		flyway.clean();
		flyway.migrate();

		SchoolRepository schoolRepository = new SchoolRepository(dataSource);
		StudentRepository studentRepository = new StudentRepository(dataSource);

		SchoolStudentService service = new SchoolStudentService(schoolRepository,studentRepository);

		List<School> schoolsByCity = service.findSchoolsByCity("Debrecen");

		schoolsByCity.forEach(s-> System.out.println(s.getSchoolName()));

		List<Student> students = service.findStudentsByYearInSchool(11,1);

		students.forEach(s-> System.out.println(s.getName()));

		System.out.println(service.findSchoolWithMostStudentsJava().getSchoolName());
		System.out.println(service.findSchoolWithMostStudentsSql().getSchoolName());
	}
}
