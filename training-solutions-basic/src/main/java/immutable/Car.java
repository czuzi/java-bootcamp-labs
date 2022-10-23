package immutable;

import java.time.LocalDate;

public class Car {

	private String brand;
	private String model;
	private int yearOfProduction;

	public Car(String brand, String model, int yearOfProduction) {
		if (brand == null || brand.isBlank()) {
			throw new IllegalArgumentException("Brand name cannot be empty!");
		}
		if (yearOfProduction > LocalDate.now().getYear()) {
			throw new IllegalArgumentException("Year of production cannot be in the future!");
		}
		this.brand = brand;
		this.model = model;
		this.yearOfProduction = yearOfProduction;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}
}
