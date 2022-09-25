package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

	@Test
	void testPublicTransport() {
		PublicVehicle bus = new Bus(3, 2.3d, "volvo");
		PublicVehicle tram = new Tram(22, 5.3d, 12);
		PublicVehicle metro = new Metro(32, 2d, 19);

		PublicTransport publicTransport = new PublicTransport();
		publicTransport.addPublicVehicle(bus);
		publicTransport.addPublicVehicle(tram);
		publicTransport.addPublicVehicle(metro);

		assertEquals(3, publicTransport.getPublicVehicles().size());
	}
}