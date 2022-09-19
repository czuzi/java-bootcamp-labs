package day03;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

	@Test
	void testAddValidPersonToConcert() {
		Concert concert = new Concert();
		Ticket ticket = new Ticket("IDLES", LocalDateTime.of(2022,12,4,21,0), 20000);

		concert.addPerson(new Person(ticket), LocalTime.of(20,1));

		assertEquals(1, concert.getPeople().size());
		assertThrows(IllegalArgumentException.class, ()-> concert.addPerson(new Person(ticket), LocalTime.of(19,59)));
	}

	@Test
	void testAddPersonWithFrontStageTicket() {
		Concert concert = new Concert();
		Ticket frontStageTicket = new FrontOfStageTicket("IDLES",
				LocalDateTime.of(2022,12,4,21,0),
				20000,
				"SD33123");

		assertDoesNotThrow(() -> concert.addPerson(new Person(frontStageTicket), LocalTime.of(19,59)));
	}
}