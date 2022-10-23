package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HikingTour {

	private List<FieldPoint> fieldPoints = new ArrayList<>();

	public List<FieldPoint> getFieldPoints() {
		return fieldPoints;
	}

	public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
		if (timeOfLogging == null) {
			throw new IllegalArgumentException("Time of logging must not be null!");
		}
		fieldPoints.addAll(Arrays.asList(fieldPointsToLog));
		for (FieldPoint fieldPoint: fieldPoints) {
			fieldPoint.setTimeOfLogging(timeOfLogging);
		}
	}
}
