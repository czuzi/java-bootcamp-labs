package day03;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class FrontOfStageTicketTest {

	@Test
	void createFrontOfStageTicket() {
		FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("IDLES",
				LocalDateTime.of(2022,12,4,21,0),
				20000,
				"SD33123");
		assertEquals("SD33123", frontOfStageTicket.getCode());
	}

	@Test
	void createFrontOfStageTicketAsTicket() {
		Ticket frontOfStageTicket = new FrontOfStageTicket("IDLES",
				LocalDateTime.of(2022,12,4,21,0),
				20000,
				"SD33123");
		assertEquals("IDLES", frontOfStageTicket.getBandName());
	}

	@Test
	void testEntryTime() {
		Ticket frontOfStageTicket = new FrontOfStageTicket("IDLES",
				LocalDateTime.of(2022,12,4,21,0),
				20000,
				"SD33123");
		assertEquals(LocalTime.of(19,0), frontOfStageTicket.entry());
	}
}