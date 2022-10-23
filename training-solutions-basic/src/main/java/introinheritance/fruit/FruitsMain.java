package introinheritance.fruit;

public class FruitsMain {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		fruit.setName("Peach");
		fruit.setWeight(2.33d);
		System.out.println(fruit.getName());
		System.out.println(fruit.getWeight());

		Apple apple = new Apple();
		apple.setPieces(3);
		apple.setName("alma");
		apple.setWeight(1.2d);
		System.out.println(apple.getName());
		System.out.println(apple.getPieces());
		System.out.println(apple.getWeight());

		Grape grape = new Grape();
		grape.setName("szolo");
		grape.setWeight(0.3d);
		grape.setType("red");
		System.out.println(grape.getName());
		System.out.println(grape.getWeight());
		System.out.println(grape.getType());

		GoldenDelicious golden = new GoldenDelicious();
		golden.setName("golden alma");
		golden.setWeight(1.2);
		golden.setPieces(6);

		System.out.println(golden.getName());
		System.out.println(golden.getWeight());
		System.out.println(golden.getPieces());
		System.out.println(golden.getColour());

		Starking starking = new Starking();
		starking.setName("starking alma");
		starking.setWeight(1.8);
		starking.setPieces(10);

		System.out.println(starking.getName());
		System.out.println(starking.getWeight());
		System.out.println(starking.getPieces());
		System.out.println(starking.getColour());
	}
}
