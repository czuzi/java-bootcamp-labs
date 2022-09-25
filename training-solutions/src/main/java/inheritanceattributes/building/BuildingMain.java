package inheritanceattributes.building;

public class BuildingMain {

	public static void main(String[] args) {
		Building building = new Building("House", 87.2d, 2);
		SchoolBuilding schoolBuilding = new SchoolBuilding("school", 232.2d, 4, 22);
		System.out.println(building.name);
		System.out.println(building.area);
		System.out.println(building.getFloors());
		System.out.println(schoolBuilding.name);
		System.out.println(schoolBuilding.area);
		System.out.println(schoolBuilding.getFloors());
		System.out.println(schoolBuilding.getNumberOfClassRooms());
	}
}
