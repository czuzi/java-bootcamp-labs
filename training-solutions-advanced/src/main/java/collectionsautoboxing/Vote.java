package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

	public Map<VoteResult, Integer> getResult(Map<String, VoteResult> results) {
		Map<VoteResult, Integer> res = new HashMap<>();
		for (VoteResult actual : results.values()) {
			if (!res.containsKey(actual)) {
				res.put(actual, 0);
			}
			res.put(actual, res.get(actual) + 1);
		}
		return res;
	}
}
