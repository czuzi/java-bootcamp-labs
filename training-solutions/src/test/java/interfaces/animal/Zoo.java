package interfaces.animal;

import java.util.List;

public class Zoo {

	private List<Animal> animals;

	public Zoo(List<Animal> animals) {
		this.animals = animals;
	}

	public int getNumberOfAllLegs() {
		int count = 0;
		for (Animal animal: animals) {
			count += animal.getNumberOfLegs();
		}
		return count;
	}

	public int getNumberOfAnimals() {
		return animals.size();
	}
}
