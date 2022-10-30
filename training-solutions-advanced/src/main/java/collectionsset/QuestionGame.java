package collectionsset;

import java.util.*;

public class QuestionGame {

	private List<RightAnswer> rightAnswers;

	public QuestionGame(List<RightAnswer> rightAnswers) {
		this.rightAnswers = rightAnswers;
	}

	public Set<String> drawWinners() {

		if (rightAnswers.size() < 5) {
			throw new IllegalArgumentException("Not enough right answers!");
		}

		Set<String> winners = new HashSet<>();
		Random random = new Random();
		for (int i = 0; winners.size() < 5; i++) {
			winners.add(rightAnswers.get(random.nextInt(0, rightAnswers.size())).getName());
		}
		return winners;
	}
}
