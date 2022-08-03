package consultations.w02d03;

import java.util.Scanner;

public class MathematicsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.isPrime(number));
    }
}
