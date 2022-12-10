package day03;

import java.util.ArrayList;
import java.util.List;

public class School {

	private Long id;
	private String schoolName;
	private String city;
	private List<Student> students;

	public School(Long id, String schoolName, String city, List<Student> students) {
		this.id = id;
		this.schoolName = schoolName;
		this.city = city;
		this.students = students;
	}

	public School(String schoolName, String city, List<Student> students) {
		this.schoolName = schoolName;
		this.city = city;
		this.students = students;
	}

	public School(String schoolName, String city) {
		this(schoolName, city, new ArrayList<>());
	}

	public School(Long id, String schoolName, String city) {
		this(id, schoolName, city, new ArrayList<>());
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void addAllStudents(List<Student> students){
		students.addAll(students);
	}

	public Long getId() {
		return id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public String getCity() {
		return city;
	}

	public List<Student> getStudents() {
		return students;
	}
}
