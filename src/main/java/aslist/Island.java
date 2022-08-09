package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {

	public static void main(String[] args) {
		List<String> importantThings = Arrays.asList("Kindle", "Glasses", "Guitar");
		importantThings.set(1, "Knife");
		System.out.println(importantThings);
	}
}
