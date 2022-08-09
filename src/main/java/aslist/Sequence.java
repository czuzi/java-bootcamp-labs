package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		List<Integer> elements = new ArrayList<>(Arrays.asList(3,4,7));

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to add to the sequence?");
		int numbersToAdd = sc.nextInt();

		for (int i = 0; i < numbersToAdd; i++) {
			elements.add(elements.get(elements.size() - 1) + elements.get(elements.size() - 2));
		}
		System.out.println(elements);
	}
}
