package consultations.w04d01.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

	PerfectNumbers perfectNumbers = new PerfectNumbers();

	@Test
	void perfectNumberTrue() {
		assertTrue(perfectNumbers.isPerfectNumber(6));
		assertTrue(perfectNumbers.isPerfectNumber(33550336));
	}

	@Test
	void  perfectNumbersFalse() {
		assertFalse(perfectNumbers.isPerfectNumber(123));
		assertFalse(perfectNumbers.isPerfectNumber(1234223));
	}
}