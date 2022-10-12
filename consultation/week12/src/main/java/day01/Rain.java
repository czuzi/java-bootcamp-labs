package day01;

import java.time.LocalDate;

public class Rain {

	private int rainAmount;
	private LocalDate date;

	public Rain(int rainAmount, LocalDate date) {
		this.rainAmount = rainAmount;
		this.date = date;
	}

	public int getRainAmount() {
		return rainAmount;
	}

	public LocalDate getDate() {
		return date;
	}
}

