package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your e-mail address:");
        String email = scanner.nextLine();
        System.out.println("Your name: " + name);
        System.out.println("Your email: " + email);
    }
}
