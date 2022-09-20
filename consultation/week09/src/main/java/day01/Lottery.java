package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

	private int pool;
	private int amountToDraw;

	public Lottery(int pool, int amountToDraw) {
		this.pool = pool;
		this.amountToDraw = amountToDraw;
	}

	public List<Integer> startLottery() {
		Random random = new Random();
		List<Integer> winningNumbers = new ArrayList<>();
		do {
			int randomNum = random.nextInt(1,pool+1);
			if (!winningNumbers.contains(randomNum)) {
				winningNumbers.add(randomNum);
			}
		} while (winningNumbers.size() < amountToDraw);
		return winningNumbers;
	}
}
