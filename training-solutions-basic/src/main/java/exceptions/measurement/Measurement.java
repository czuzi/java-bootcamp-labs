package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

	public List<String> readFromFile(Path path) {
		try {
			return Files.readAllLines(path);
		} catch (IOException ioe) {
			throw new IllegalStateException("Can not read file.", ioe);
		}
	}

	public List<String> validate(List<String> lines) {
		List<String> res = new ArrayList<>();
		for (String line : lines) {
			if (!isValid(line)) {
				res.add(line);
			}
		}
		return res;
	}

	private boolean isValid(String line) {
		String[] lineSplit = line.split( ",");
		try {
			return validateLineLength(lineSplit)
					&& validateLineNumber(lineSplit[0])
					&& validateMeasuredValue(lineSplit[1])
					&& validateName(lineSplit[2]);
		} catch (IndexOutOfBoundsException ex) {
			return false;
		}
	}

	private boolean validateLineLength(String[] parts) {
		return parts.length == 3;
	}

	private boolean validateLineNumber(String numberString) {
		try {
			Integer.parseInt(numberString);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	private boolean validateMeasuredValue(String numberString) {
		try {
			Double.parseDouble(numberString);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	private boolean validateName(String nameString) {
		String[] nameParts = nameString.split(" ");
		return nameParts.length >= 2;
	}
}
