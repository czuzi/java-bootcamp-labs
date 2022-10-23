package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {

	private List<PublicVehicle> publicVehicles = new ArrayList<>();

	public List<PublicVehicle> getPublicVehicles() {
		return publicVehicles;
	}

	public void addPublicVehicle(PublicVehicle publicVehicle) {
		publicVehicles.add(publicVehicle);
	}
}
