package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

	private String address;
	private double area;
	private int floors;

	public Building(String address, double area, int floors) {
		this.address = address;
		this.area = area;
		this.floors = floors;
	}

	public String getAddress() {
		return address;
	}

	public double getArea() {
		return area;
	}

	public int getFloors() {
		return floors;
	}

	@Override
	public int compareTo(Building o) {
		return Integer.valueOf(floors).compareTo(o.floors);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Building building = (Building) o;
		return floors == building.floors;
	}

	@Override
	public int hashCode() {
		return Objects.hash(floors);
	}

	public static void main(String[] args) {
		Set<Building> buildings = new TreeSet<>();
		buildings.add(new Building("Fő utca 3.", 345, 7));
		buildings.add(new Building("Kossuth utca 6.", 276, 2));
		buildings.add(new Building("Petőfi utca 96.", 1347, 13));
		buildings.add(new Building("Rákóczi utca 32.", 53, 1));
		buildings.add(new Building("Bezerédi utca 54.", 698, 4));

		System.out.println(buildings);
	}
}
