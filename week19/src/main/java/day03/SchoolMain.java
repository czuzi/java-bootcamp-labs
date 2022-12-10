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

	}
}
