package stringbasic;

public class Student {

	private Person person;
	private String neptunId;
	private String studentId;
	private String entranceId;

	public Student(Person person, String neptunId, String studentId) {
		this.person = person;
		this.neptunId = neptunId;
		this.studentId = studentId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getNeptunId() {
		return neptunId;
	}

	public void setNeptunId(String neptunId) {
		this.neptunId = neptunId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getEntranceId() {
		return entranceId;
	}

	public void setEntranceId(String entranceId) {
		this.entranceId = entranceId;
	}
}
