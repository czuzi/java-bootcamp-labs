package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

	private List<String> capsuleColor = new ArrayList<>();

	public void addLast(String capsule) {
		capsuleColor.add(capsule);
	}

	public void addFirst(String capsule) {
		capsuleColor.add(0, capsule);
	}

	public void removeLast() {
		capsuleColor.remove(capsuleColor.size()-1);
	}

	public void removeFirst() {
		capsuleColor.remove(0);
	}

	public List<String> getCapsuleColor() {
		return capsuleColor;
	}

	public static void main(String[] args) {
		Capsules capsules = new Capsules();
		System.out.println(capsules.getCapsuleColor());
		capsules.addLast("pink");
		capsules.addLast("black");
		capsules.addLast("green");
		capsules.addFirst("white");
		capsules.removeLast();
		capsules.removeFirst();
		System.out.println(capsules.getCapsuleColor());

	}
}
