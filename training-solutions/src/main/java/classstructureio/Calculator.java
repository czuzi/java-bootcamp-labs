package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can add two numbers here.");
        System.out.print("First number: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println(firstNumber + " + " + secondNumber);
        System.out.println(firstNumber + secondNumber);
    }
}
