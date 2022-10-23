package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

	private List<String> players = new ArrayList<>(Arrays.asList("John", "Paul", null, "Jones"));

	public String getWinner() {
		Random random = new Random();
		int randomValue = random.nextInt(players.size());
		String winner = players.get(randomValue);
		return winner.toUpperCase();
	}
}
