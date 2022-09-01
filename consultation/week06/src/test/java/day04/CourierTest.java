package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

	private Courier courier;

	@BeforeEach
	void init() {
		courier = new Courier();
		courier.addRide(new Ride(1,1,10));
		courier.addRide(new Ride(1,2,5));
		courier.addRide(new Ride(3,1,10));
		courier.addRide(new Ride(3,2,10));
		courier.addRide(new Ride(6,1,10));
	}

	@Test
	void testAddFirstRide() {
		Courier courier = new Courier();
		Ride ride = new Ride(1,1,10);
		assertDoesNotThrow(() -> courier.addRide(ride));
		assertEquals(1, courier.getRides().size());
		assertEquals(ride, courier.getRides().get(0));
	}

	@Test
	void testAddRideSuccess() {
		Ride ride = new Ride(6,2,15);
		Ride anotherRide = new Ride(7,1,8);
		assertDoesNotThrow(() -> courier.addRide(ride));
		assertDoesNotThrow(() -> courier.addRide(anotherRide));
		assertEquals(7, courier.getRides().size());
	}

}