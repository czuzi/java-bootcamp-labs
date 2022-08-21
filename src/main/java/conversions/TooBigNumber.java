package conversions;

public class TooBigNumber {

	public static void main(String[] args) {
		TooBigNumber tooBigNumber = new TooBigNumber();
		System.out.println(tooBigNumber.getRigthResult(1));
	}

	public long getRigthResult(int number) {
		return (long) 2_147_483_647 + number;
	}
}
