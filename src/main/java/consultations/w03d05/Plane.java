package consultations.w03d05;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public int numberOfPackages() {
        int sum = 0;
        for (Passenger passenger : passengers) {
            sum += passenger.getNumberOfBaggage();
        }
        return sum;
    }

    public boolean addPassenger(Passenger passenger) {
        if (maxCapacity > passengers.size()) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }
}
