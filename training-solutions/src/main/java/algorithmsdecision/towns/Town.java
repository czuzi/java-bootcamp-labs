package algorithmsdecision.towns;

import java.util.List;

public class Town {

	public boolean containsFewerHabitants(List<Integer> populations, int margin) {
		for (int current : populations) {
			if (current < margin) {
				return true;
			}
		}
		return false;
	}
}
