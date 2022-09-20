package methodstructure.pendrives;

public class Pendrive {

	private String name;
	private int capacity;
	private int price;

	public Pendrive(String name, int capacity, int price) {
		this.name = name;
		this.capacity = capacity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Pendrive{" +
				"name='" + name + '\'' +
				", capacity=" + capacity +
				", price=" + price +
				'}';
	}

	public void risePrice(int percent) {
		price *= (100 + percent) / 100f;
	}

	public int comparePricePerCapacity(Pendrive other) {
		return Float.compare((float) price / capacity, (float) other.price / other.capacity);
	}

	public boolean isCheaperThan(Pendrive other) {
		return price < other.price;
	}
}
