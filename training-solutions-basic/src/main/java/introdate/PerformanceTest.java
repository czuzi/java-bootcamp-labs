package introdate;

public class PerformanceTest {

    public static void main(String[] args) {
        Performance performance = new Performance(2022, 8, 15, "Arctic Monkeys", 21, 0, 23, 0);
        System.out.println(performance.getArtist());
        System.out.println(performance.getDate());
        System.out.println(performance.getStartTime());
        System.out.println(performance.getEndTime());
        System.out.println(performance.getInfo());
    }
}
