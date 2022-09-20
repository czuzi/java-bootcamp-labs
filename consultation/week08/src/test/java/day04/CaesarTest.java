package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

	@Test
	void testCaesarCypher() {
		Caesar caesar = new Caesar(23);
		assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD".toLowerCase(), caesar.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
	}
}