package day03;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

	private String bandName;
	private LocalDateTime date;
	private int price;

	public Ticket(String bandName, LocalDateTime date, int price) {
		this.bandName = bandName;
		this.date = date;
		this.price = price;
	}

	public String getBandName() {
		return bandName;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public int getPrice() {
		return price;
	}

	public LocalTime entry() {
		return getDate().toLocalTime().minusHours(1);
	}
}
