package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

	@Test
	void testReadValidFile() {
		String firstWordWithA = new Words().getFirstWordWithA(Path.of("src/test/resources/words.txt"));
		assertEquals("Anna", firstWordWithA);
	}

	@Test
	void testNoMatchingWords() {
		String firstWordWithA = new Words().getFirstWordWithA(Path.of("src/test/resources/otherwords.txt"));
		assertEquals("A", firstWordWithA);
	}
}