package day01;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RainData {

	private List<Rain> rainDailyData = new ArrayList<>();

	public List<Rain> getRainDailyData() {
		return rainDailyData;
	}

	public void readDataFromFile(Path path) {
		try {
			readFile(path);
		} catch (IOException ioe) {
			throw new IllegalArgumentException("Cannot read file", ioe);
		}
	}

	private void readFile(Path path) throws IOException {
		Scanner sc = new Scanner(path);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			processLines(line);
		}
	}

	private void processLines(String line) {
		String[] splitLine = line.split(";");
		rainDailyData.add(new Rain(Integer.parseInt(splitLine[0]), LocalDate.parse(splitLine[1])));
	}

	public int sumOfRainInMonth(int year, int month) {
		int res = 0;
		for (Rain rain: rainDailyData) {
			if (rain.getDate().getYear() == year && rain.getDate().getMonthValue() == month) {
				res += rain.getRainAmount();
			}
		}
		return res;
	}
}
