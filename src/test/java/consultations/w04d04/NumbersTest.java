package consultations.w04d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
	@Test
	void testNumbers() {
		Numbers numbers = new Numbers();
		assertEquals(14, numbers.sumOfDigits(1535));
	}
}