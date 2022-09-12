package day03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

	NumberSequence numberSequence = new NumberSequence();

	@Test
	void testUpdateListWithList() {
		numberSequence.updateList(List.of(2, 3, 4));

		assertEquals(3, numberSequence.getNumbers().size());
		assertEquals(3, numberSequence.getNumbers().get(1));
	}

	@Test
	void testUpdateListWithRandomNumbers() {
		numberSequence.updateList(4, 1, 10);

		assertEquals(4, numberSequence.getNumbers().size());
	}

	@Test
	void testUpdateListValuesWithRandomNumbers() {
		numberSequence.updateList(4, 1, 10);
		for (Integer actual : numberSequence.getNumbers()) {
			assertTrue(actual >= 1 && actual <= 10);
		}
	}

	@Test
	void testCloseToAverage() {
		numberSequence.updateList(List.of(2, 3, 4, 7, 9, 11));
		List<Integer> result = numberSequence.closeToAverage(2);
		assertEquals(2,result.size());
	}

}