package consultations.w04d03;

import java.util.Scanner;

public class Hangman {

	private String wordToFind = "almafa";
	private String wordStatus = "_".repeat(wordToFind.length());
	private int chances = 7;

	public static void main(String[] args) {
		new Hangman().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Guess the word: " + wordStatus);
			System.out.println("You have " + chances + " remaining");
			System.out.print("Enter your guess: ");
			String guess = sc.nextLine();
			if (wordToFind.contains(guess)) {
				System.out.println("There is a match");
				updateWorldStatus(guess);
			} else {
				System.out.println("There's no such character in the word");
				chances--;
			}
		}
		while (!wordStatus.equals(wordToFind) && chances > 0);

		if (chances == 0) {
			System.out.println("You lost!");
		} else {
			System.out.println("You win!");
		}
	}

	private void updateWorldStatus(String guess) {
		char[] actualStatus = wordStatus.toCharArray();
		for (int i = 0; i < wordToFind.length(); i++) {
			if (wordToFind.charAt(i) == guess.charAt(0)) {
				actualStatus[i] = guess.charAt(0);
			}
		}
		wordStatus = new String(actualStatus);
	}
}
