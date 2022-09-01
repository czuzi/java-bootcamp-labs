package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Client client = new Client();

        System.out.print("Enter your name: ");
        client.name = scanner.nextLine();

        System.out.print("Enter your DoB: ");
        client.year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your address: ");
        client.address = scanner.nextLine();

        System.out.println("Your name is: " + client.name + ", you were born in " + client.year + " and your address is: " + client.address);

    }
}
