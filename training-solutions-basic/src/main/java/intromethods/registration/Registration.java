package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your firstname");
		String firstName = sc.nextLine();
		System.out.println("Enter your lastname");
		String lastName = sc.nextLine();
		System.out.println("Enter your year of birth");
		int birthYear = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your month of birth");
		int birthMonth = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your day of birth");
		int birthDay = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your email address");
		String email = sc.nextLine();

		Registration registration = new Registration();

		Person person = new Person(registration.nameConcat(firstName, lastName), LocalDate.of(birthYear, birthMonth, birthDay), email);
		System.out.println(person);
	}

	public String nameConcat(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
}
