package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(150.12, true);
        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int floorDistance = (int) distance.getDistanceInKm();
        System.out.println(floorDistance);
    }
}
