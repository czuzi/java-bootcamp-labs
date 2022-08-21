package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

	Words words;

	@BeforeEach
	void init() {
		words = new Words();
		words.addWord("hello");
		words.addWord("hi");
		words.addWord("wallet");
		words.addWord("chocolate");
		words.addWord("cases");
		words.addWord("ballet");
	}

	@Test
	void testRemoveWordsWithoutLetter() {
		List<String> expect = Arrays.asList("cases");
		words.removeWordsWithoutLetter("s");
		assertEquals(expect, words.getWordList());
	}

	@Test
	void testRemoveWordsWithOtherLength() {
		List<String> expect = Arrays.asList("hello", "cases");
		words.removeWordsWithOtherLength(5);
		assertEquals(expect, words.getWordList());
	}
}