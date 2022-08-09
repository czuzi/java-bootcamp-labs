package consultations.w03d02;

public class Actor {

	private String name;
	private int dateOfBirth;

	public Actor(String name, int dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}
}
