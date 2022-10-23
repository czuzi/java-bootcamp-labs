package consultations.w04d04;

public class Numbers {

	public int sumOfDigits(int number) {
		String numStr = Integer.toString(number);
		int res = 0;
		for(int i = 0; i < numStr.length(); i++) {
			res += Character.getNumericValue(numStr.charAt(i));
		}
		return res;
	}
}
