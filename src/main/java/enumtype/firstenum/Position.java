package enumtype.firstenum;

public enum Position {
	CEO(2_000_000, "healthcare, bonus"), JUNIOR(400_000, "healthcare");

	private final int salary;
	private final String benefit;

	Position(int salary, String benefit) {
		this.salary = salary;
		this.benefit = benefit;
	}

	public int getSalary() {
		return salary;
	}

	public String getBenefit() {
		return benefit;
	}
}
