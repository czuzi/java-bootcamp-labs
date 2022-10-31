package collectionsmap;

import java.util.Map;

public class Casting {

	public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
		int target = Integer.MAX_VALUE;
		for (Map.Entry<Integer, String> entry : applicants.entrySet()) {
			if (entry.getKey() > lastNumber && entry.getKey() < target) {
				target = entry.getKey();
			}
		}
		return applicants.get(target);
	}
}
