package day01;

import java.util.Arrays;

public class AgeSorter {

	public int[] sortAges(int[] ages) {
		for (int i = 0; i < ages.length; i++) {
			for (int j = i + 1; j < ages.length; j++) {
				int tmp;
				if (ages[i] > ages[j]) {
					tmp = ages[i];
					ages[i] = ages[j];
					ages[j] = tmp;
				}
			}
		}
		return ages;
	}

	public static void main(String[] args) {
		AgeSorter ageSorter = new AgeSorter();
		System.out.println(Arrays.toString(ageSorter.sortAges(new int[]{5, 75, 23, 63, 2})));
	}
}
