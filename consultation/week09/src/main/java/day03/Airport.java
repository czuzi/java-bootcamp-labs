package day03;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airport {

	private List<Flight> flights = new ArrayList<>();

	public List<Flight> getFlights() {
		return flights;
	}

	public void readFile(Path path) {
		try {
			processLines(path);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private void processLines(Path path) throws IOException {
		Scanner sc = new Scanner(path);
		List<String> lines = new ArrayList<>();
		while (sc.hasNextLine()) {
			lines.add(sc.nextLine());
		}
		addFlightToList(lines);
		sc.close();
	}

	private void addFlightToList(List<String> lines) {
		for (String line: lines) {
			String[] lineArray = line.split(" ");
			LocalTime time = createLocalTime(lineArray);
			flights.add(new Flight(lineArray[0], lineArray[1], lineArray[2], time));
		}
	}

	private static LocalTime createLocalTime(String[] lineArray) {
		int localTimeHours = Integer.parseInt(lineArray[3].split(":")[0]);
		int localTimeMinutes = Integer.parseInt(lineArray[3].split(":")[1]);
		return LocalTime.of(localTimeHours, localTimeMinutes);
	}

	public String isMore() {
		int arrival = 0;
		int departure = 0;
		for (Flight flight: flights) {
			if ("Departure".equals(flight.getDirection())) {
				departure++;
			} else {
				arrival++;
			}
		}
		return evaluateFrequency(arrival, departure);
	}

	private static String evaluateFrequency(int arrival, int departure) {
		if (departure < arrival) {
			return "Arrival";
		} else if (departure > arrival) {
			return "Departure";
		} else {
			return "Equals";
		}
	}

	public boolean isValidSchedule() {
		List<Flight> departures = new ArrayList<>();
		List<Flight> arrivals = new ArrayList<>();
		createLists(departures, arrivals);
		return validateSchedule(departures) && validateSchedule(arrivals);
	}

	private static boolean validateSchedule(List<Flight> flights) {
		for (int i = 0; i < flights.size(); i++) {
			for (int j = 0; j < flights.size(); j++) {
				if (i != j &&
						flights.get(j).getTime().isBefore(flights.get(i).getTime()) &&
						flights.get(j).getTime().plusMinutes(3).isAfter(flights.get(i).getTime())) {
					return false;
				}
			}
		}
		return true;
	}

	private void createLists(List<Flight> departures, List<Flight> arrivals) {
		for (Flight flight: flights) {
			if ("Departure".equals(flight.getDirection())) {
				departures.add(flight);
			}
			if ("Arrival".equals(flight.getDirection())) {
				arrivals.add(flight);
			}
		}
	}

	public void removeInvalidFlight() {
		flights.removeIf(flight -> flight.getTime().isAfter(LocalTime.of(0, 0))
				&& flight.getTime().isBefore(LocalTime.of(5, 0)));
	}
}
