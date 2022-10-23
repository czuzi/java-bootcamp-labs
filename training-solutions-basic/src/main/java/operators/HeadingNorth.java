package operators;

public class HeadingNorth {

	public int getNumberOfNewDirections() {

		int count = 0;
		int currentDegrees = 0;

		for (int i = 10; currentDegrees <= 360; i += 10) {
			currentDegrees += i;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		HeadingNorth headingNorth = new HeadingNorth();
		System.out.println(headingNorth.getNumberOfNewDirections());
	}
}
