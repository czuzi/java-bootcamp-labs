package algorithmsmax.temperature;

import java.util.List;

public class Temperature {


	public int getMin(List<Integer> temperatures) {
		int min = temperatures.get(0);
		for (int temp : temperatures) {
			if (temp < min) {
				min = temp;
			}
		}
		return min;
	}
}
