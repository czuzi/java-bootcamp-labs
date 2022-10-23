package dynamictypes.publictransport;

public class Metro extends PublicVehicle {

	private int numberOfStation;

	public Metro(int lineNumber, double length, int numberOfStation) {
		super(lineNumber, length);
		this.numberOfStation = numberOfStation;
	}

	public int getNumberOfStation() {
		return numberOfStation;
	}
}
