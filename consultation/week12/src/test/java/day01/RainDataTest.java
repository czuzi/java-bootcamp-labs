package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class RainDataTest {

	@Test
	void testFileRead() {
		RainData rainData = new RainData();
		rainData.readDataFromFile(Path.of("src/test/resources/rain.csv"));
		assertEquals(10, rainData.getRainDailyData().get(0).getRainAmount());
		assertEquals(34, rainData.sumOfRainInMonth(2022, 1));
	}
}