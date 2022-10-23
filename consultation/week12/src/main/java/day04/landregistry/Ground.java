package day04.landregistry;

public class Ground {

	private Address address;

	private Owner owner;

	private Tax tax;

	private int area;

	public Ground(Address address, Owner owner, Tax tax, int area) {
		this.address = address;
		this.owner = owner;
		this.tax = tax;
		this.area = area;
	}

	public Address getAddress() {
		return address;
	}

	public Owner getOwner() {
		return owner;
	}

	public Tax getTax() {
		return tax;
	}

	public int getTaxAmount() {
		return tax.getValue() * area;
	}

	public int getArea() {
		return area;
	}
}
