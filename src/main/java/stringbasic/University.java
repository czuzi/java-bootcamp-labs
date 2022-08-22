package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

	List<Student> students = new ArrayList<>();

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public boolean areEqual(Student student, Student anotherStudent) {
		String studentNeptunId = student.getNeptunId();
		String anotherStudentNeptunId = anotherStudent.getNeptunId();
		String studentStudentId = student.getStudentId();
		String anotherStudentStudentId = anotherStudent.getStudentId();

		return studentNeptunId.equals(anotherStudentNeptunId) && studentStudentId.equals(anotherStudentStudentId);
	}
}
