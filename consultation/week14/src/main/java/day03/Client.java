package day03;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Client client = (Client) o;
		return Objects.equals(regNumber, client.regNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regNumber);
	}
}
