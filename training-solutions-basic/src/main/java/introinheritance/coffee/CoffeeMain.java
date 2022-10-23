package introinheritance.coffee;

public class CoffeeMain {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.setName("Americano");
		coffee.setPrice(290);
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
		Cappuccino cappuccino = new Cappuccino();
		cappuccino.setName("cappuccino");
		cappuccino.setPrice(390);
		System.out.println(cappuccino.getName());
		System.out.println(cappuccino.getPrice());
	}
}
