package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

	@Test
	void testName() {
		Dragon dragon = new Dragon("Dracharis", 1, 30.33);
		assertEquals("Dracharis", dragon.getName());
	}
	@Test
	void testNameFalse() {
		Dragon dragon = new Dragon("Dracharis", 1, 30.33);
		assertNotEquals("dracharis", dragon.getName());
	}

	@Test
	void testNumberOfHeads() {
		Dragon dragon = new Dragon("Dracharis", 1, 30.33);
		assertEquals(1, dragon.getNumberOfHeads());
		assertTrue(dragon.getNumberOfHeads() == 1);
		assertFalse(dragon.getNumberOfHeads() != 1);
	}

	@Test
	void testHeight() {
		Dragon dragon = new Dragon("Dracharis", 1, 30.33);
		assertEquals(33.33333, dragon.getHeight(), 0.005);
	}

	@Test
	void testNull() {
		Dragon dragon = new Dragon("Dracharis", 1, 30.33);
		Dragon dragon2 = null;
		assertNull(dragon2);
		assertNotNull(dragon);
	}

	@Test
	void testSameObjects() {
		Dragon dragon = new Dragon("Dracharis", 1, 30.33);
		Dragon dragon2 = dragon;
		assertSame(dragon, dragon2);
	}

	@Test
	void testNotSameObject() {
		Dragon dragon = new Dragon("Dracharis", 1, 30.33);
		Dragon dragon2 = new Dragon("Dracharis", 1, 30.33);
		assertNotSame(dragon, dragon2);
	}

}