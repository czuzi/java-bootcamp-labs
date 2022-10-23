package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int number = Integer.parseInt(scanner.nextLine());
		if (number < 0) {
			throw new IllegalArgumentException("not positive");
		}
		System.out.println(number);
	}
}
