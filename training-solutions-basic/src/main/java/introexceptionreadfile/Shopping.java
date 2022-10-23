package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Shopping {

	public static void main(String[] args) {
		try {
			List<String> lines = Files.readAllLines(Path.of("src/main/resources/shoppinglist.txt"));
			System.out.println(lines);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
