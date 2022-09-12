package day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

	private List<Integer> numbers = new ArrayList<>();

	public void updateList(List<Integer> otherNumbers) {
		numbers.addAll(otherNumbers);
	}

	public void updateList(int num, int min, int max) {
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			numbers.add(random.nextInt(min, max + 1));
		}
	}

	public List<Integer> closeToAverage(int value) {
		double avg = calculateAvg();
		List<Integer> res = new ArrayList<>();
		for (Integer number : numbers) {
			if (Math.abs(number - avg) <= value) {
				res.add(number);
			}
		}
		return res;
	}

	private double calculateAvg() {
		double sum = 0;
		for (int actual : numbers) {
			sum += actual;
		}
		return sum / numbers.size();
	}

	public List<Integer> getNumbers() {
		return numbers;
	}
}
