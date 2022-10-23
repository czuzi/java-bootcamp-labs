package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
	public static void main(String[] args) {
		List<String> people = new ArrayList<>(Arrays.asList("john", "john2", "john3", "john4", "john5", "john6", "john7", "john8", "john9", "john10"));
		List<String> winners = new ArrayList<>();
		Random rnd = new Random();
		winners.add(people.get(rnd.nextInt(5)));
		winners.add(people.get(rnd.nextInt(5) + 5));
		System.out.println(winners);
	}
}
