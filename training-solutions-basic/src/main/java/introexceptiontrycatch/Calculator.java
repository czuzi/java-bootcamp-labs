package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {



	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");

		int firstNumber = 0;
		try {
			firstNumber = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException nfe) {
			System.out.println("Not a number");
			System.out.println(nfe.getMessage());
		}

		System.out.print("Enter the second number: ");

		int secondNumber = 0;
		try {
			secondNumber = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException nfe) {
			System.out.println("Not a number");
			System.out.println(nfe.getMessage());
		}

		System.out.print("Enter the operator you want to use: ");
		String operator = sc.nextLine();
		calculator.executeOperation(firstNumber, secondNumber, operator);
	}

	private void executeOperation(int firstNumber, int secondNumber, String operator) {

		try {
			switch (operator) {
				case "+" -> System.out.println(firstNumber + secondNumber);
				case "-" -> System.out.println(firstNumber - secondNumber);
				case "*" -> System.out.println(firstNumber * secondNumber);
				case "/" -> System.out.println(firstNumber / secondNumber);
				default -> System.out.println("default");
			}
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("Invalid operation (divided by zero).");
		}
	}
}
