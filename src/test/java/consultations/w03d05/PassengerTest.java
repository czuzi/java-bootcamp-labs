package consultations.w03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    @Test
    void createPassenger() {
        Passenger passenger = new Passenger("John Doe", "fkk776", 22);
        assertEquals("John Doe", passenger.getName());
        assertEquals("fkk776", passenger.getTicketId());
        assertEquals(22, passenger.getNumberOfBaggage());
    }

}