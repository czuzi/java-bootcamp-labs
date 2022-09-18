package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Prefix {

	public List<String> getWordsStartWith(List<String> words, String prefix) {
		List<String> res = new ArrayList<>();
		for (String word: words) {
			if (word.contains(prefix)) {
				res.add(word);
			}
		}
		return res;
	}
}
