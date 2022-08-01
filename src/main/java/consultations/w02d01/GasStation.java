package consultations.w02d01;

public class GasStation {

    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int refuel(Car car, int liter) {
        car.setGasAmount(liter);
        return car.getGasAmount() * price;
    }
}
