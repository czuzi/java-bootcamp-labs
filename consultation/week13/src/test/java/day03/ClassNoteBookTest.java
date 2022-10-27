package day03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {

	ClassNoteBook classNoteBook = new ClassNoteBook();

	@Test
	void testAddStudent() {
		assertTrue(classNoteBook.getStudentListMap().isEmpty());
		classNoteBook.addStudent(new Student("2112", "Freeza"));
		assertFalse(classNoteBook.getStudentListMap().isEmpty());
		assertEquals(0, classNoteBook.getStudentListMap().get("2112").size());
	}

	@Test
	void testAddMark() {
		classNoteBook.addStudent(new Student("2112", "Freeza"));
		classNoteBook.addMark("2112", 1);
		classNoteBook.addMark("2112", 2);
		classNoteBook.addMark("2112", 4);
		classNoteBook.addMark("2112", 1);
		assertEquals(4, classNoteBook.getStudentListMap().get("2112").size());
	}

	@Test
	void testAddMarkWithWrongId() {
		assertThrows(IllegalArgumentException.class, () -> classNoteBook.addMark("122", 4), "Id does not exist: 122");
	}
}