package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

	public static void main(String[] args) {
		List<String> foods = new ArrayList<>();
		foods.add("Pees");
		foods.add("Meat");
		foods.add("Spinach");
		foods.add("Ice cream");
		foods.add("Ice");
		System.out.println(foods);
		System.out.println(foods.size());
		foods.remove("Ice");
		foods.remove("Meat");
		System.out.println(foods);
		System.out.println(foods.size());
	}
}
