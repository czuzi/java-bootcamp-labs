package mathproblems;

import java.util.Arrays;

public class Division {

	public void getDivisors(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(number + " osztoja: " + i);
			}
		}
	}

	public void getRightNumbers(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] % i == 0) {
				System.out.println(numbers[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Division division = new Division();
		division.getDivisors(17);
		int[] numbers = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
		division.getRightNumbers(numbers);
	}
}
