package day03;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

	@Test
	void testCreateTicket() {
		Ticket ticket = new Ticket("IDLES", LocalDateTime.of(2022,12,4,21,0), 20000);
		assertEquals("IDLES", ticket.getBandName());
		assertEquals(20000, ticket.getPrice());
	}

	@Test
	void testEntryTime(){
		Ticket ticket = new Ticket("IDLES", LocalDateTime.of(2022,11,11,21,0), 20000);

		assertEquals(LocalTime.of(20,0),ticket.entry());
	}
}