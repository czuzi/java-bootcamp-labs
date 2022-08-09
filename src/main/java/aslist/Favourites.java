package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

	public static void main(String[] args) {
		List<String> favouriteThings = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your favourite animal:");
		String animal = sc.nextLine();
		favouriteThings.add(animal);

		System.out.println("Enter your favourite actor:");
		String actor = sc.nextLine();
		favouriteThings.add(actor);

		System.out.println("Enter your favourite actress:");
		String actress = sc.nextLine();
		favouriteThings.add(actress);

		System.out.println("Enter your favourite movie:");
		String movie = sc.nextLine();
		favouriteThings.add(movie);

		System.out.println("Enter your favourite book:");
		String book = sc.nextLine();
		favouriteThings.add(book);

		System.out.println("Enter your favourite band:");
		String band = sc.nextLine();
		favouriteThings.add(band);

		System.out.println(favouriteThings);
		System.out.println(favouriteThings.size());
	}
}
