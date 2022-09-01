package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {

	private List<Ride> rides;

	public Courier() {
		this.rides = new ArrayList<>();
	}

	public void addRide(Ride ride) {
		int size = rides.size();
		if (size == 0 && ride.getNumberOfRide() == 1) {
			rides.add(ride);
		} else {
			Ride lastRide = rides.get(size - 1);
			evaluateRide(lastRide, ride);
		}
	}

	private void evaluateRide(Ride lastRide, Ride ride) {
		if (lastRide.getDay() < ride.getDay() && ride.getNumberOfRide() == 1
				||
				lastRide.getDay() == ride.getDay() && lastRide.getNumberOfRide()+1 == ride.getNumberOfRide()) {
			rides.add(ride);
		} else {
			throw new IllegalArgumentException("Cannot add past ride." + ride.toString());
		}
	}

	public List<Ride> getRides() {
		return rides;
	}
}
