package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

	private List<String> wordList = new ArrayList<>();

	public List<String> getWordList() {
		return wordList;
	}

	public void addWord(String word) {
		wordList.add(word);
	}

	public void removeWordsWithoutLetter(String letter) {
		wordList.removeIf(word -> !word.contains(letter));
	}

	public void removeWordsWithOtherLength(int length) {
		wordList.removeIf(word -> word.length() != length);
	}
}
