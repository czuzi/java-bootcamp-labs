package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Path;

public class Underground {

	public static void main(String[] args) {
		Operations operations = new Operations();
		try {

			String res = operations.getDailySchedule(operations.readFile(Path.of("src/main/resources/underground.txt")));
			System.out.println(res);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
