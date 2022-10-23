package day04.landregistry;

import java.util.Objects;

public class Owner {

	private String taxNumber;

	public Owner(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Owner owner = (Owner) o;
		return Objects.equals(taxNumber, owner.taxNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(taxNumber);
	}
}
