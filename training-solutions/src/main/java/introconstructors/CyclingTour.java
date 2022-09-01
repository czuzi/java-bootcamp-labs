package introconstructors;

import java.time.LocalDate;

public class CyclingTour {

	public static void main(String[] args) {
		CyclingTour cyclingTour = new CyclingTour("Balaton korbetekeres", LocalDate.of(2022, 9, 12));
		System.out.println(cyclingTour.getDescription());
		System.out.println(cyclingTour.getStartDate());
		System.out.println(cyclingTour.getNumberOfPeople());
		System.out.println(cyclingTour.getKms());

		cyclingTour.registerPerson(214);
		cyclingTour.ride(100);
		System.out.println(cyclingTour.getNumberOfPeople());
		System.out.println(cyclingTour.getKms());
	}

	private String description;
	private LocalDate startDate;
	private int numberOfPeople;
	private double kms;

	public CyclingTour(String description, LocalDate startDate) {
		this.description = description;
		this.startDate = startDate;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public double getKms() {
		return kms;
	}

	public void registerPerson(int person) {
		numberOfPeople += person;
	}

	public void ride(double km) {
		kms += km;
	}
}
