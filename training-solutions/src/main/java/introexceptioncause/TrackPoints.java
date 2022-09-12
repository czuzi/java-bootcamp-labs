package introexceptioncause;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrackPoints {

	private void printAltitudeDifferences(List<String> altitudes) {
		for (int i = 1; i < altitudes.size(); i++) {
			System.out.println(Integer.parseInt(altitudes.get(i)) - Integer.parseInt(altitudes.get(i-1)));
		}
	}

	public void getAltitudesDifferences(Path path) {
		try {
			readFile(path);
		} catch (IOException ioe) {
			throw new IllegalStateException("File does not exist", ioe);
		}
	}

	private void readFile(Path path) throws IOException {
		List<String> altitudes = new ArrayList<>();
		Scanner sc = new Scanner(path);
		while (sc.hasNextLine()) {
			altitudes.add(sc.nextLine().split(";")[2]);
		}
		printAltitudeDifferences(altitudes);
	}
}
