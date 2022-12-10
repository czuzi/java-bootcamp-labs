package day03;

public class Student {

	private Long id;
	private String name;
	private int schoolYear;
	private int schoolId;

	public Student(String name, int schoolYear, int schoolId) {
		this.name = name;
		this.schoolYear = schoolYear;
		this.schoolId = schoolId;
	}

	public Student(String name, int schoolYear) {
		this.name = name;
		this.schoolYear = schoolYear;
	}

	public Student(Long id, String name, int schoolYear, int schoolId) {
		this.id = id;
		this.name = name;
		this.schoolYear = schoolYear;
		this.schoolId = schoolId;
	}

	public Student(Long id, String name, int schoolYear) {
		this.id = id;
		this.name = name;
		this.schoolYear = schoolYear;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSchoolYear() {
		return schoolYear;
	}

	public int getSchoolId() {
		return schoolId;
	}
}
