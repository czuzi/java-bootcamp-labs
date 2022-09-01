package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {


	public Courier createCourierByFile(Path path) {
		List<String> lines;
		Courier courier = new Courier();
		try {
			lines = Files.readAllLines(path);
		} catch(IOException ioe) {
			throw new IllegalStateException("Cant read the file", ioe);
		}
		for (String actualLine: lines) {
			String[] temp = actualLine.split(" ");
			Ride ride = new Ride(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
			courier.addRide(ride);
		}
		return courier;
	}
}
