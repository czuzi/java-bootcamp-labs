package introexceptioncause;

import java.nio.file.Path;

public class Tracking {

	public static void main(String[] args) {
		TrackPoints trackPoints = new TrackPoints();
		try {
			trackPoints.getAltitudesDifferences(Path.of("src/main/resources/tracking_.csv"));
		} catch (IllegalStateException ise) {
			ise.getCause().printStackTrace();
		}
	}
}
