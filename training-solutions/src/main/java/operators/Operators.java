package operators;

public class Operators {

	public boolean isEven(int num) {
		return num % 2 == 0;
	}

	public String getResultOfDivision(int number, int divisor) {
		return "The result of " + number + "/" + divisor + " is " + number / divisor + ". The remainder is " + number % divisor;
	}

	public String isNull(String s) {
		return s == null ? "It is null" : "It is not null";
	}

	public boolean isEmpty(String s) {
		return "".equals(s) || s == null;
	}
}
