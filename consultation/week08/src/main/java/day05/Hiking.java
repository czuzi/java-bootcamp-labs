package day05;

import java.util.List;

public class Hiking {

	public double getPlusElevation(List<Double> heights) {
		double res = 0.0;
		for (int i = 1; i < heights.size(); i++) {
			if (heights.get(i-1) < heights.get(i)) {
				res += heights.get(i) - heights.get(i-1);
			}
		}
		return res;
	}
}
