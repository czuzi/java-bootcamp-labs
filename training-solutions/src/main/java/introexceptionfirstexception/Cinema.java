package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter the movie you want to buy a ticket for:");
		String movie = sc.nextLine();
		System.out.println("Enter how many tickets you want to buy:");
		int amount = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the row number:");
		int row = Integer.parseInt(sc.nextLine());
		StringBuilder sb = new StringBuilder("Your ticket info:\n");
		sb.append("Name: ").append(name).append("\nMovie title: ").append(movie).append("\nSeat info: ");
		for (int i = 0; i < amount; i++) {
			sb.append("Row number ").append(row).append(" seat ").append(i + 1).append(" ");
		}
		System.out.println(sb);
	}

}
