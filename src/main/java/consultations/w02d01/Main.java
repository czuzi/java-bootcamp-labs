package consultations.w02d01;

public class Main {

    public static void main(String[] args) {
        GasStation gasStation = new GasStation(480);
        Car car = new Car();
        car.setDistance(3441);
        car.setGasAmount(122);
        System.out.println(car.gasConsumption());
        System.out.println(car.getGasAmount());

        Car otherCar = new Car();
        System.out.println(otherCar.getGasAmount());
        System.out.println(gasStation.refuel(otherCar, 40));
        System.out.println(otherCar.getGasAmount());
    }
}
