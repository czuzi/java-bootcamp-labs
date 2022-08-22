package stringbasic;

public class Person {

	private String name;
	private String email;
	private String taj;
	private String bankAccountNumber;
	private String phone;

	public Person(String name, String email, String taj, String bankAccountNumber, String phone) {
		this.name = name;
		this.email = email;
		this.taj = taj;
		this.bankAccountNumber = bankAccountNumber;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTaj() {
		return taj;
	}

	public void setTaj(String taj) {
		this.taj = taj;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
