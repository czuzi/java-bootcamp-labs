package collectionsautoboxing;

import java.util.*;

public class Paper {

	private Map<String, Integer> paperData = new HashMap<>();

	public Map<String, Integer> getPaperData() {
		return paperData;
	}

	public void putFurtherPaper(String className, int kilograms) {
		if (!paperData.containsKey(className)) {
			paperData.put(className, kilograms);
		} else {
			paperData.put(className, paperData.get(className) + kilograms);
		}
	}

	public String getWinnerClass() {
		String winner = "";
		int maxPaper = 0;
		for (String s : paperData.keySet()) {
			if (paperData.get(s) > maxPaper) {
				maxPaper = paperData.get(s);
				winner = s;
			}
		}
		return winner;
	}

	public int getTotalWeight() {
		int totalWeight = 0;
		for (int kg : paperData.values()){
			totalWeight += kg;
		}
		return totalWeight;
	}
}
