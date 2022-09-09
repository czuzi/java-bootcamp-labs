package introexceptioncause;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaulStreetBoys {

	public static void main(String[] args) {

		try {
			List<String> boys = new PaulStreetBoys().validateFile(Path.of("src/main/resources/palutcaifiuk_.txt"));
			System.out.println(boys);
		} catch (IllegalStateException ise) {
			ise.getCause().printStackTrace();
		}
	}

	private List<String> validateFile(Path path) {
		try {
			return readFile(path);
		} catch (IOException ioe) {
			throw new IllegalStateException("File not found", ioe);
		}
	}

	private List<String> readFile(Path path) throws IOException {
		Scanner sc = new Scanner(path);
		List<String> names = new ArrayList<>();
		while (sc.hasNextLine()) {
			String currentLine = sc.nextLine();
			checkNames(names, currentLine);
		}
		return names;
	}

	private void checkNames(List<String> names, String currentLine) {
		if ("Nemecsek Ernő".equals(currentLine)) {
			names.add(currentLine.toLowerCase());
		} else {
			names.add(currentLine);
		}
	}
}
