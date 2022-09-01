package arrays;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		ArraysMain arraysMain = new ArraysMain();
		System.out.println(arraysMain.numberOfDaysAsString());

		double[] day1 = {24.8,26.7,30.4,32.1,29.1};
		double[] day2 = {24.8,26.0,30.7,32.1,29.1};
		System.out.println(arraysMain.sameTempValues(day1, day2));

		int[] lotteryPlayed = {12, 2, 83, 4, 15};
		int[] lotteryDrawn = {2, 15, 4, 83, 12};
		System.out.println(arraysMain.wonLottery(lotteryPlayed, lotteryDrawn));

	}

	public String numberOfDaysAsString() {
		String[] numberOfDays = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
		return Arrays.toString(numberOfDays);
	}

	public boolean sameTempValues(double[] day, double[] anotherDay) {
		return Arrays.equals(day, anotherDay);
	}

	public boolean wonLottery(int[] playedNumbers, int[] drawnNumbers) {
		int[] sortedPlayedNumbers = Arrays.copyOf(playedNumbers, playedNumbers.length);
		int[] sortedDrawnNumbers = Arrays.copyOf(drawnNumbers, drawnNumbers.length);
		Arrays.sort(sortedPlayedNumbers);
		Arrays.sort(sortedDrawnNumbers);
		return Arrays.equals(sortedPlayedNumbers, sortedDrawnNumbers);
	}
}
