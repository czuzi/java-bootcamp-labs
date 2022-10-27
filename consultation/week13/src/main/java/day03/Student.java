package day03;

public class Student {

	private String StudentId;
	private String name;

	public Student(String studentId, String name) {
		StudentId = studentId;
		this.name = name;
	}

	public String getStudentId() {
		return StudentId;
	}

	public String getName() {
		return name;
	}
}
