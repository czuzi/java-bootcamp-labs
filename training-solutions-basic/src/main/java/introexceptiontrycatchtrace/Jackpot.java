package introexceptiontrycatchtrace;

public class Jackpot {

	public static void main(String[] args) {
		Winner winner = new Winner();

		try {
			System.out.println("The winner is: " + winner.getWinner());
		} catch (NullPointerException npe) {
			System.out.println("Error occurred");
			System.out.println(npe.getMessage());
		}
	}
}
