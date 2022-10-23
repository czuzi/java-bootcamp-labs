package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Words {

	public String getFirstWordWithA(Path path) {
		try {
			return readFile(path);
		} catch (IOException ioe) {
			throw new IllegalStateException("File cannot read", ioe);
		}
	}

	private String readFile(Path path) throws IOException {
		Scanner sc = new Scanner(path);
		while (sc.hasNextLine()) {
			String actual = sc.nextLine();
			if (actual.charAt(0) == 'A') {
				return actual;
			}
		}
		return "A";
	}
}
