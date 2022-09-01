package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first hours: ");
        int hours1 = scanner.nextInt();
        System.out.print("Enter first minutes: ");
        int minutes1 = scanner.nextInt();
        System.out.print("Enter first seconds: ");
        int seconds1 = scanner.nextInt();

        System.out.print("Enter second hours: ");
        int hours2 = scanner.nextInt();
        System.out.print("Enter second minutes: ");
        int minutes2 = scanner.nextInt();
        System.out.print("Enter second seconds: ");
        int seconds2 = scanner.nextInt();

        Time time = new Time(hours1, minutes1, seconds1);
        Time otherTime = new Time(hours2, minutes2, seconds2);

        System.out.println("First time input: " + time.toString() + ", what is in minutes: " + time.getInMinutes());
        System.out.println("Second time input: " + otherTime.toString() + ", what is in minutes: " + otherTime .getInSeconds());
        System.out.println("Is the first one sooner than the other one? " + time.earlierThan(otherTime));
    }
}
