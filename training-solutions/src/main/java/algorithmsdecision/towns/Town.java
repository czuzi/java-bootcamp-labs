package algorithmsdecision.towns;

import java.util.List;

public class Town {

	public boolean containsFewerHabitants(List<Integer> populations, int margin) {
		boolean res = false;
		for (int current : populations) {
			if (current < margin) {
				res = true;
			}
		}
		return res;
	}
}
