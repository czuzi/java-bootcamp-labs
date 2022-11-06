package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

	public List<Integer> selectWinningNumbers(int lotteryType, int poolSize) {
		if (lotteryType >= poolSize) {
			throw new IllegalArgumentException("There must be more balls than the winning numbers!");
		}
		List<Integer> pool = createNumberPool(poolSize);
		return drawNumbers(lotteryType, pool);
	}

	private List<Integer> drawNumbers(int lotteryType, List<Integer> pool) {
		List<Integer> winningNumbers = new ArrayList<>();
		Collections.shuffle(pool);
		for (int i = 0; i < lotteryType; i++) {
			winningNumbers.add(pool.get(i));
		}
		Collections.sort(winningNumbers);
		return winningNumbers;
	}

	private List<Integer> createNumberPool(int poolSize) {
		List<Integer> pool = new ArrayList<>();
		for (int i = 0; i < poolSize; i++) {
			pool.add(i);
		}
		return pool;
	}

}
