package collectionsiterator;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

	private List<ChristmasPresent> presents;

	public ChristmasShopping(List<ChristmasPresent> presents) {
		this.presents = presents;
	}

	public List<ChristmasPresent> getPresents() {
		return presents;
	}

	public void addNewPresent(ChristmasPresent present) {
		presents.add(present);
	}

	public void removeTooExpensivePresent(int maxPrice) {
		Iterator<ChristmasPresent> iterator = presents.iterator();
		while (iterator.hasNext()) {
			ChristmasPresent present = iterator.next();
			if (present.getPrice() > maxPrice) {
				iterator.remove();
			}
		}
	}
}
