package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(Path.of("src/main/resources/names.txt"));
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if ("dr".equals(line.substring(0,2))) {
					System.out.println(line);
				} else {
					System.out.println(" ");
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			System.out.println("End of read");
		}
	}
}
