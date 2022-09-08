package introexceptioncause;

import java.io.IOException;
import java.nio.file.Path;

import java.util.Scanner;

public class Poem {

	public static void main(String[] args) {
		try {
			StringBuilder res = new Poem().readFile(Path.of("src/main/resources/poem.txt"));
			System.out.println(res);
		} catch (IllegalStateException ise) {
			ise.getCause().printStackTrace();
		}
	}

	public StringBuilder readFile(Path path) {
		StringBuilder sb = new StringBuilder();
		try {
			Scanner sc = new Scanner(path);
			while (sc.hasNextLine()) {
				sb.append(sc.nextLine().charAt(0));
			}
		} catch (IOException ioe) {
			throw new IllegalStateException("File not found", ioe);
		}
		return sb;

	}
}
