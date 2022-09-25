package interfaces.animal;

public class Lion implements Animal {

	private String name = "Lion";
	private int numberOfLegs = 4;

	@Override
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	@Override
	public String getName() {
		return name;
	}
}
