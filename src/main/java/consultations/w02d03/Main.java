package consultations.w02d03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i*i < number; i++) {
            System.out.println(i*i);
        }
    }
}
