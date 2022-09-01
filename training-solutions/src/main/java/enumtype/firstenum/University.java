package enumtype.firstenum;

public enum University {
	DE("Debreceni Egyetem"), SZTE("Szegedi Tudomanyegyetem");

	private String name;

	University(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
