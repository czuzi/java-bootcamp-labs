package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> people = new ArrayList<>();
		System.out.println("Enter how many records you want to write");
		int amount = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < amount; i++) {
			System.out.println("Enter name:");
			String name = sc.nextLine();
			System.out.println("Enter birthday:");
			String birthday = sc.nextLine();
			people.add(name + ", " + birthday);
		}
		try {
			Files.write(Path.of("src/main/resources/birthdays.txt"), people);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
