package methodstructure.bmi;

public class BodyMass {

	private final double weight;
	private final double height;

	public BodyMass(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double getBodyMassIndex() {
		return weight / Math.pow(height, 2);
	}

	public BmiCategory getBody() {
		if (getBodyMassIndex() < 18.5) {
			return BmiCategory.UNDERWEIGHT;
		} else if (getBodyMassIndex() > 25) {
			return  BmiCategory.OVERWEIGHT;
		} else {
			return BmiCategory.NORMAL;
		}
	}

	public boolean isThinnerThan(BodyMass other) {
		return getBodyMassIndex() < other.getBodyMassIndex();
	}
}
