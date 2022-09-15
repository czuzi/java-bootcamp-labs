package algorithmsdecision.words;

import java.util.List;

public class Word {

	public boolean containsLongerWord(List<String> words, String target) {
		for (String word : words) {
			if (word.length() > target.length()) {
				return true;
			}
		}
		return false;
	}
}
