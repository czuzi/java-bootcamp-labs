package consultations.w02d01;

public class Main {

    public static void main(String[] args) {
        GasStation gasStation = new GasStation(480);
        Car car = new Car();
        car.setDistance(3441);
        car.setGasAmount(122);
        System.out.println(car.gasConsumption());
    }
}
