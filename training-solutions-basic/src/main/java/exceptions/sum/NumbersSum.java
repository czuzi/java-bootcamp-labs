package exceptions.sum;

public class NumbersSum {

	public int getSum(int[] numbers) {
		int sum = 0;
		try {
			for (int num : numbers) {
				sum += num;
			}
		} catch (NullPointerException iae) {
			throw new IllegalArgumentException("Parameter should not be null!", iae);
		}
		return sum;
	}

	public int getSum(String[] numbers) {
		int sum = 0;
		try {
			for (String numStr : numbers) {
				sum += Integer.parseInt(numStr);
			}
		} catch (NullPointerException iae) {
			throw new IllegalArgumentException("Parameter should not be null!", iae);
		} catch (NumberFormatException nfe) {
			throw new IllegalArgumentException("Illegal numbers!", nfe);
		}
		return sum;
	}
}
