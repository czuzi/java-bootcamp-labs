package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Neptun {

	public static void main(String[] args) {
		Neptun neptun = new Neptun();
		try {
			neptun.readFile(Path.of("src/main/resources/neptun_.csv"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private void readFile(Path path) throws IOException {
		Scanner sc = new Scanner(path);
		List<String> codes = new ArrayList<>();
		while (sc.hasNextLine()) {
			codes.add(sc.nextLine().split(",")[1]);
		}
		System.out.println(codes);
	}
}
