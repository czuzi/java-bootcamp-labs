package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        System.out.println("1. Felhasznalok listazasa\n" +
                            "2. Felhasznalo felvetele\n" +
                            "Tobbi: Kilepes");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the option you choose: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input) {
            case 1 -> System.out.println("Felhasznalok listazasa");
            case 2 -> System.out.println("Felhasznalok felvetele");
            default -> System.out.println("Invalid answer");
        }
    }
}
