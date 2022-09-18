package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {


	public List<String> getFirstTwoLetters(List<String> words) {

		List<String> res = new ArrayList<>();
		for (String word: words) {
			res.add(word.substring(0, 2));
		}
		return res;
	}
}
