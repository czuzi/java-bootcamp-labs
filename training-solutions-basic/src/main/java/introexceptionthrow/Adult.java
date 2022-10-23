package introexceptionthrow;

public class Adult {

	private String name;
	private int age;

	public Adult(String name, int age) {
		this.name = name;
		this.age = checkAge(age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private int checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Must be 18");
		}
		return age;
	}
}
