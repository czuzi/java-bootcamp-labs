package day04;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VowelsCounterTest {

	VowelsCounter vowelsCounter = new VowelsCounter();

	@Test
	void testCountVowels() {
		Map<Character, Integer> testMap = vowelsCounter.countVowels("This is an apple");
		assertEquals(2, testMap.get('a'));
		assertEquals(3, testMap.size());
	}
}