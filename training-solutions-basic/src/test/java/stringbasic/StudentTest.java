package stringbasic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

	Student student;

	@BeforeEach
	void init() {
		Person person = new Person("Kovács Péter", "kovacsp@gmail.com", "123456789",
				"12345678-87654321-12345678", "+3620-1234567");
		student = new Student(person, "A1B2C3", "9876543210");
	}

	@Test
	void testCreate() {
		assertEquals("A1B2C3", student.getNeptunId());
		assertEquals("9876543210", student.getStudentId());
		assertNull(student.getEntranceId());
	}

	@Test
	void testSetCardNumber() {
		student.setEntranceId("CB-0123");

		assertEquals("CB-0123", student.getEntranceId());
	}

}