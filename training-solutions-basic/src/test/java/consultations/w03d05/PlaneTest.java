package consultations.w03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void createPlane() {
        Plane plane = new Plane(180);
        assertEquals(180, plane.getMaxCapacity());
    }

    @Test
    void testAddPassengerCanSit() {
        Plane plane = new Plane(180);
        boolean result = plane.addPassenger(new Passenger("John Doe", "fkk776", 22));
        assertTrue(result);
        assertEquals(1, plane.getPassengers().size());
    }

    @Test
    void testAddPassengerCannotSit() {
        Plane plane = new Plane(1);
        plane.addPassenger(new Passenger("John Doe", "fkk776", 22));

        boolean result = plane.addPassenger(new Passenger("Jane", "hhs772", 22));

        assertFalse(result);
        assertEquals(1, plane.getPassengers().size());
    }

    @Test
    void testNumberOfPackagesEmptyPlane() {
        Plane plane = new Plane(111);
        assertEquals(0, plane.numberOfPackages());
    }

    @Test
    void testNumberOfPackages() {
        Plane plane = new Plane(111);
        plane.addPassenger(new Passenger("John Doe", "fkk776", 2));
        plane.addPassenger(new Passenger("Jane", "hhj887", 0));
        plane.addPassenger(new Passenger("Jack", "ggt667", 3));

        assertEquals(5, plane.numberOfPackages());
    }
}