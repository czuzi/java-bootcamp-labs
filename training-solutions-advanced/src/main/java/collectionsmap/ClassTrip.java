package collectionsmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ClassTrip {

	private Map<String, Integer> inpayments = new HashMap<>();

	public Map<String, Integer> getInpayments() {
		return inpayments;
	}

	public void loadInpayments(Path path) {
		try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
			String line;
			while ((line = br.readLine()) != null) {
				processLines(line, br);
			}
		} catch (IOException ioe) {
			throw new IllegalStateException("Can not read file.", ioe);
		}
	}

	private void processLines(String line, BufferedReader br) {
		String[] parts = line.split(":");
		inpayments.put(parts[0], Integer.parseInt(parts[1].trim()));
	}
}
