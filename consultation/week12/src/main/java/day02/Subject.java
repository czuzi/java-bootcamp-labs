package day02;

public class Subject {

	private String teacher;
	private String subjectName;
	private String group;
	private int numberOfLessons;

	public Subject(String teacher, String subjectName, String group, int numberOfLessons) {
		this.teacher = teacher;
		this.subjectName = subjectName;
		this.group = group;
		this.numberOfLessons = numberOfLessons;
	}

	public String getTeacher() {
		return teacher;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public String getGroup() {
		return group;
	}

	public int getNumberOfLessons() {
		return numberOfLessons;
	}
}
