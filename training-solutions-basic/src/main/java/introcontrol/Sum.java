package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " of 5: ");
            int current = scanner.nextInt();
            sum += current;
        }
        System.out.println(sum);
    }
}
