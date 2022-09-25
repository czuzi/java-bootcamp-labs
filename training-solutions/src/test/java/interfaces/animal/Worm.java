package interfaces.animal;

public class Worm implements Animal {

	private String name = "Worm";
	private int numberOfLegs = 0;

	@Override
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	@Override
	public String getName() {
		return name;
	}
}
