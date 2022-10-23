package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

	@Test
	void testAddInvalidGrade() {
		assertThrows(IllegalArgumentException.class, () -> new Student().addGrade(6), "Grade must be between 1 and 5");
	}

	@Test
	void testAddValidGrade() {
		Student student = new Student();
		student.addGrade(2);
		student.addGrade(5);
		student.addGrade(4);
		assertEquals(3, student.getGrades().size());
		assertEquals( 4, student.getGrades().get(2));
	}
}