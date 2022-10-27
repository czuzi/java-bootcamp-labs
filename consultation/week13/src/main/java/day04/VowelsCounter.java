package day04;

import java.util.HashMap;
import java.util.Map;

public class VowelsCounter {

	public static final String VOWELS = "aeiou";

	public Map<Character, Integer> countVowels(String input) {
		Map<Character, Integer> res = new HashMap<>();
		for (Character c : input.toCharArray()) {
			if (VOWELS.contains(String.valueOf(c))) {
				if (!res.containsKey(c)) {
					res.put(c, 0);
				}
				res.put(c, res.get(c) + 1);
			}
		}
		return res;
	}
}
