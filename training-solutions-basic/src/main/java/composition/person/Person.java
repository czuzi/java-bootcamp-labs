package composition.person;

public class Person {

	private String name;
	private String idCard;
	private Address address;

	public Person(String name, String idCard) {
		this.name = name;
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public String getIdCard() {
		return idCard;
	}

	public Address getAddress() {
		return address;
	}

	public String personToString() {
		return "name: " + name + "id: " + idCard;
	}

	public void moveTo(String country, String city, String streetAndNumber, String zipCode) {
		address = new Address(country, city, streetAndNumber, zipCode);
	}

}
