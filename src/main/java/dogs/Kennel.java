package dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();
		Dog dog1 = new Dog("perdi", 1, "dotted");
		Dog dog2 = new Dog("mazsi", 13, "white");
		Dog dog3 = new Dog("lucifer", 4, "black");

		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);

		System.out.println(dogs);

		Dog dog4 = dogs.get(0);
		dog4.setColor("black-and-white");

		System.out.println(dogs);

		Dog dog5 = new Dog("rex", 8, "brown");
		System.out.println(dog5);
		dog5 = dogs.get(1);
		System.out.println(dog5);
		dogs.add(dog5);
		System.out.println(dogs);
		Dog dog6 = dog4;
		dog6.setColor("purple");
		System.out.println(dogs);

		List<Dog> dogs2 = dogs;
		Dog dog7 = dog4;
		dog7.setColor("grey");
		System.out.println(dogs2);
		dog2.setColor("blue");
		System.out.println(dogs);
		System.out.println(dogs2);
		dog2 = null;
		System.out.println(dogs2);
		Dog dog8 = dogs.get(1);
		dog8 = null;
		System.out.println(dogs2);
		Dog dog9 = dogs.get(1);
		dog9.setColor("yellow");
		System.out.println(dogs2);
	}
}
