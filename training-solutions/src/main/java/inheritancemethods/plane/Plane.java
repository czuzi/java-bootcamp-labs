package inheritancemethods.plane;

public class Plane {

	public static void main(String[] args) {
		Passenger passenger = new Passenger("john", 100_000);
		PriorityPassenger priorityPassenger = new PriorityPassenger("jane", 100_000, 20);
		FirstClassPassenger firstClassPassenger = new FirstClassPassenger("jack", 100_000, 20);

		System.out.println(passenger.getPriceOfPlaneTicket());
		System.out.println(priorityPassenger.getPriceOfPlaneTicket());
		System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
	}
}
