package day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

	Airport airport;

	@BeforeEach
	void init() {
		airport = new Airport();
		airport.readFile(Path.of("src/test/resources/planes.txt"));
	}

	@Test
	void testReadFile() {
		assertEquals(LocalTime.of(9,35), airport.getFlights().get(7).getTime());
		assertEquals("Istanbul", airport.getFlights().get(24).getDestination());
	}

	@Test
	void getFlights() {
		assertEquals(100, airport.getFlights().size());
	}

	@Test
	void isMore() {
		assertEquals("Departure", airport.isMore());
		Airport airport2 = new Airport();
		airport2.readFile(Path.of("src/test/resources/planes2.txt"));
		assertEquals("Equals", airport2.isMore());
	}

	@Test
	void testIsValidSchedule() {
		Airport airport2 = new Airport();
		airport2.readFile(Path.of("src/test/resources/planes2.txt"));
		assertFalse(airport.isValidSchedule());
		assertTrue(airport2.isValidSchedule());
	}

	@Test
	void testRemoveInvalidFlights() {
		Airport airport2 = new Airport();
		airport2.readFile(Path.of("src/test/resources/planes2.txt"));
		airport.removeInvalidFlight();
		airport2.removeInvalidFlight();
		assertEquals(100, airport.getFlights().size());
		assertEquals(15, airport2.getFlights().size());
		assertEquals("Istanbul", airport2.getFlights().get(7).getDestination());
	}
}