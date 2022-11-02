package collectionsiterator;

public class ChristmasPresent {

	private String description;
	private String recipientsName;
	private int price;

	public ChristmasPresent(String description, String recipientsName, int price) {
		this.description = description;
		this.recipientsName = recipientsName;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public String getRecipientsName() {
		return recipientsName;
	}

	public int getPrice() {
		return price;
	}
}
