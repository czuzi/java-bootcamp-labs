package looptypes;

public class Sum {

	public void printSums(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {
			int sum = numbers[i] + numbers[i+1];
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {

		Sum sum = new Sum();
		sum.printSums(new int[]{1, 2, 3, 4});
	}
}
