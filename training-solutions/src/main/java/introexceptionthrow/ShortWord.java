package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a short word. 5 letters maximum");
		String word = sc.nextLine();
		if (word.length() > 5) {
			throw new IllegalArgumentException("too long");
		}

		for (int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				throw new IllegalArgumentException("Input can only contains letters");
			}
		}
		System.out.println(word);
	}
}
