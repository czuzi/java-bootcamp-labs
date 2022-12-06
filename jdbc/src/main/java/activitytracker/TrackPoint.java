package activitytracker;

import java.time.LocalDate;

public class TrackPoint {

	private int id;
	private LocalDate time;
	private double lat;
	private double lon;

	public TrackPoint(LocalDate time, double lat, double lon) {
		this.time = time;
		this.lat = lat;
		this.lon = lon;
	}

	public LocalDate getTime() {
		return time;
	}

	public double getLat() {
		return lat;
	}

	public double getLon() {
		return lon;
	}
}
