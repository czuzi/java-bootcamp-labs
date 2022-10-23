package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Enter a even number");
			try {
				number = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException nfe) {
				throw new IllegalArgumentException("not a number", nfe);
			} finally {
				System.out.println("end of round");
			}
		} while (number % 2 != 0);
	}
}
