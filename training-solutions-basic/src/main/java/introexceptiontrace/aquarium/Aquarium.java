package introexceptiontrace.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

	private List<Fish> ornamentalFish = new ArrayList<>();

	public List<Fish> getOrnamentalFish() {
		return ornamentalFish;
	}

	public void addFish(Fish fish) {
		ornamentalFish.add(fish);
	}

	public int getNumberOfFish() {
		return ornamentalFish.size();
	}

	public static void main(String[] args) {
		Aquarium aquarium = new Aquarium();
		aquarium.addFish(new Fish("sword fish", "blue"));
		aquarium.addFish(new Fish("shark", "grey"));
	}
}
