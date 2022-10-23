package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Roadmap {

	public static void main(String[] args) {

		List<String> citys = Arrays.asList("nyirtelek", "tokaj", "bodrogkeresztur");
		try {
			Files.write(Path.of("src/main/resources/roadmap.txt"), citys);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
