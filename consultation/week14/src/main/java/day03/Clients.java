package day03;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Clients {

	private List<Client> clientList = new ArrayList<>();

	public void addClient(Client client) {
		clientList.add(client);
	}

	public Client findClientByRegNumber(String regNumber) {
		List<Client> other = new ArrayList<>(clientList);
		Collections.sort(other);
		int index = Collections.binarySearch(other, new Client(null, regNumber));

		if (index < 0) {
			throw new IllegalArgumentException("Client not found" + regNumber);
		}
		return clientList.get(index);
	}

	public Client findClientByRegNumberIndexOf(String regNumber) {
		int index = clientList.indexOf(new Client(null, regNumber));
		return clientList.get(index);
	}
}
