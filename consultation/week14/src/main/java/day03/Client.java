package day03;

public class Client implements Comparable<Client> {

	private String name;
	private String regNumber;

	public Client(String name, String regNumber) {
		this.name = name;
		this.regNumber = regNumber;
	}

	public String getName() {
		return name;
	}

	public String getRegNumber() {
		return regNumber;
	}

	@Override
	public int compareTo(Client o) {
		return regNumber.compareTo(o.regNumber);
	}
}
