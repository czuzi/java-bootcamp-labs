package immutable;

import java.time.LocalDate;

public class Monument {

	private String name;
	private String address;
	private LocalDate dateOfRegistry;

	public Monument(String name, String address, LocalDate dateOfRegistry, String registryNumber) {
		if (isEmpty(name) || isEmpty(address) || isEmpty(registryNumber)) {
			throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
		}
		this.name = name;
		this.address = address;
		this.dateOfRegistry = dateOfRegistry;
		this.registryNumber = registryNumber;
	}

	private String registryNumber;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getDateOfRegistry() {
		return dateOfRegistry;
	}

	public String getRegistryNumber() {
		return registryNumber;
	}

	private boolean isEmpty(String text) {
		if (text == null || text.isBlank()) {
			return true;
		}
		return false;
	}
}
