package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

	public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
		Trainer oldest = null;
		for (Trainer trainer : trainers) {
			if (oldest == null || trainer.getAge() > oldest.getAge()) {
				oldest = trainer;
			}
		}
		return oldest;
	}
}
