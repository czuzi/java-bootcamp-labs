package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        if (inputNumber > 100) {
            System.out.println("Nagyobb mint 100!");
        } else {
            System.out.println("Kisebb vagy egyenlo mint 100!");
        }
    }
}
