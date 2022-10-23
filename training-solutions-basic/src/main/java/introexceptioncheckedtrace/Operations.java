package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {

	public List<String> readFile(Path path) throws IOException {
		Scanner sc = new Scanner(path);
		List<String> lines = new ArrayList<>();
		while (sc.hasNextLine()) {
			lines.add(sc.nextLine());
		}
		return lines;
	}

	public String getDailySchedule(List<String> cars) {
		StringBuilder toBeReady = new StringBuilder();
		for (String car: cars) {
			if (car.charAt(0) == '2') {
				toBeReady.append(LocalDate.now()).append(" ").append(car).append("\n");
			}
		}
		return toBeReady.toString();
	}
}
