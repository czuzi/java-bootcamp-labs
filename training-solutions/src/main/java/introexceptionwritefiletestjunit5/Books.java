package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

	public void makeReadableFile(Path path) {
		List<String> readableLines = new ArrayList<>();
		readFile(readableLines);
		writeFile(path, readableLines);
	}

	private static void readFile(List<String> readableLines) {
		try {
			Scanner sc = new Scanner(Path.of("src/main/resources/books.txt"));
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				makeLinesReadable(readableLines, line);
			}
		} catch (IOException ioe) {
			throw new IllegalStateException("File cannot found", ioe);
		}
	}

	private static void makeLinesReadable(List<String> readableLines, String line) {
		String readableLine = line.split(";")[2] + ": " + line.split(";")[1];
		readableLines.add(readableLine);
	}

	private static void writeFile(Path path, List<String> readableLines) {
		try {
			Files.write(path, readableLines);
		} catch (IOException ioe) {
			throw new IllegalStateException("Cannot write file", ioe);
		}
	}
}
