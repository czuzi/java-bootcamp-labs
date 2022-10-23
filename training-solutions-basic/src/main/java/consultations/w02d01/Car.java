package consultations.w02d01;

public class Car {

    private int gasAmount;

    private int distance;

    public int getGasAmount() {
        return gasAmount;
    }

    public int getDistance() {
        return distance;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double gasConsumption() {
        return (gasAmount * 100. / distance);
    }
}
