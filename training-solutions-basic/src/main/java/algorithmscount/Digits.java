package algorithmscount;

public class Digits {

	public int getCountOfNumbers() {
		int count = 0;
		for (int i = 10; i < 100; i++) {
			int first = Integer.parseInt(Integer.toString(i).split("")[0]);
			int second = Integer.parseInt(Integer.toString(i).split("")[1]);
			if (first + 5 == second || first == second + 5) {
				count++;
			}
		}
		return count;
	}
}
