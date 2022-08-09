package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Second {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92));
		for (int i = 0; i < nums.size(); i+=2) {
			System.out.println(nums.get(i));
		}
	}
}
