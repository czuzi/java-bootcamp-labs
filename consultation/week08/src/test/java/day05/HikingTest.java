package day05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {
	Hiking hiking = new Hiking();

	@Test
	void testGetElevation() {
		assertEquals(13, hiking.getPlusElevation(Arrays.asList(10d,20d,15d,18d)));
	}

	@Test
	void testGetElevationIfZero() {
		assertEquals(0.0, hiking.getPlusElevation(Arrays.asList(32.4, 27.2, 23.0, 12.312)));
	}
}