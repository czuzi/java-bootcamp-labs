package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

	public static void main(String[] args) {
		Digits digits = new Digits();
		digits.addDigitsToList("qwe3qwe48qwead2asd193");
		System.out.println(digits.getListOfDigits());
	}

	private List<Integer> listOfDigits = new ArrayList<>();

	public List<Integer> getListOfDigits() {
		return listOfDigits;
	}

	public void addDigitsToList(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				listOfDigits.add(Integer.parseInt(String.valueOf(text.charAt(i))));
			}
		}
	}
}
