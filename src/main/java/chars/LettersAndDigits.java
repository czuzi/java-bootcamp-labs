package chars;

public class LettersAndDigits {

	public static void main(String[] args) {
		LettersAndDigits lettersAndDigits = new LettersAndDigits();
		lettersAndDigits.printLetterOrDigit("has897ty7d8.m87 ka /k");
	}

	public void printLetterOrDigit(String text) {
		for (char c: text.toCharArray()) {
			if (Character.isLetter(c)) {
				System.out.println(c + ": letter");
			} else if (Character.isDigit(c)) {
				System.out.println(c + ": digit");
			} else {
				System.out.println(c + ": other");
			}
		}
	}
}
