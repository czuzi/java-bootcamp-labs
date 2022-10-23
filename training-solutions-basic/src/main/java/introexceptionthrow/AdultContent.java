package introexceptionthrow;

import java.util.Scanner;

public class AdultContent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your age:");
		int age = Integer.parseInt(sc.nextLine());

		Adult adult = new Adult(name, age);
		System.out.println(adult.getName());
		System.out.println(adult.getAge());
	}
}
