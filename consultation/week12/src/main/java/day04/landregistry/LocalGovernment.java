package day04.landregistry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class LocalGovernment {

	private List<Ground> grounds = new ArrayList<>();

	public List<Ground> getGrounds() {
		return new ArrayList<>(grounds);
	}

	public void readGroundsFromFile(Path path) {
		try {
			List<String> lines = Files.readAllLines(path);
			processLines(lines);
		} catch (IOException ioe) {
			throw new IllegalStateException("Can not read file", ioe);
		}
	}

	private void processLines(List<String> lines) {
		for(String line : lines) {
			String[] temp = line.split(" ");
			Address address = new Address(temp[1], temp[2]);
			Owner owner = new Owner(temp[0]);
			Tax tax = Tax.valueOf(temp[3]);
			int area = Integer.parseInt(temp[4]);
			grounds.add(new Ground(address, owner, tax, area));
		}
	}

	public Set<String> collectStreetsWithDifferentTaxCategories() {
		Set<String> streets = new TreeSet<>();
		Ground firstGroundInStreet = grounds.get(0);
		for(Ground ground : grounds) {
			if (!ground.getAddress().getStreet().equals(firstGroundInStreet.getAddress().getStreet())) {
				firstGroundInStreet = ground;
			}
			if (!ground.getTax().equals(firstGroundInStreet.getTax())) {
				streets.add(ground.getAddress().getStreet());
			}
		}
		return streets;
	}

	public Map<Owner, Integer> getTaxAmountsByOwners() {
		Map<Owner, Integer> taxAmounts = new HashMap<>();
		for(Ground ground : grounds) {
			Owner owner = ground.getOwner();
			if (!taxAmounts.containsKey(owner)) {
				taxAmounts.put(owner, 0);
			}
			taxAmounts.put(owner, taxAmounts.get(owner) + ground.getTaxAmount());
		}
		return taxAmounts;
	}
}
