package day03;

import java.time.LocalTime;

public class Flight {

	private String flightNumber;
	private String direction;
	private String destination;
	private LocalTime time;

	public Flight(String flightNumber, String direction, String destination, LocalTime time) {
		this.flightNumber = flightNumber;
		this.direction = direction;
		this.destination = destination;
		this.time = time;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getDirection() {
		return direction;
	}

	public String getDestination() {
		return destination;
	}

	public LocalTime getTime() {
		return time;
	}
}
