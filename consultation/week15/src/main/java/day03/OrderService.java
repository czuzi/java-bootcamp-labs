package day03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrderService {


	private List<Order> orders = new ArrayList<>();

	public void saveOrder(Order order) {
		orders.add(order);
	}

	public List<Order> getOrders() {
		return new ArrayList<>(orders);
	}

	//    Add vissza azokat a rendeléseket, amelyek a paraméterként megadott státuszúak
	//    és a paraméterként megadott dátummal megegyező keltezésűek!
	public List<Order> getOrdersByStatusAndDate(String status, LocalDate date) {

		return orders.stream()
				.filter(o -> o.getStatus().equals(status) && o.getOrderDate().equals(date))
				.collect(Collectors.toList());
	}

	//    Határozd meg a rendelések darabszámát egy paraméterként kapott státusz alapján!
	public long getNumberOfOrdersByStatus(String status) {

		return orders.stream()
				.filter(o -> o.getStatus().equals(status))
				.count();
	}

	//    Van-e olyan rendelés, amiben kevesebb mint a megadott számú termék található?
	public boolean isOrderWithProductsLessThanGiven(int numberOfProducts) {
		return orders.stream()
				.anyMatch(order -> order.getProducts().size() < numberOfProducts);
	}

	//    Add vissza, mely napokon voltak megrendelések (a duplikátumokat szűrd ki!)
	public List<LocalDate> listOrderDates() {
		return orders.stream()
				.map(Order::getOrderDate)
				.distinct()
				.toList();
	}

	//   Add vissza, hány terméket tartalmaz a legtöbb terméket tartalmazó rendelés!
	public int getMaxProducts() {

		Optional<Order> orderWithMaxProduct = orders.stream()
				.max(Comparator.comparing(o->o.getProducts().size())); // Optional<Order>
		if (orderWithMaxProduct.isPresent()) {
			return orderWithMaxProduct.get().getProducts().size();
		} else {
			throw new IllegalArgumentException("No such order");
		}
	}

	//   Add vissza a rendeléseket egy dátum szerint sorba rendezett listában!
	public List<Order> listOrdersByOrderDate() {
		return orders.stream()
				.sorted(Comparator.comparing(Order::getOrderDate))
				.toList();
	}

	//    Alakítsd át az alábbi metódus utasításait egy stream-mé!
	public List<Order> listOrdersBeforeDate(LocalDate date) {

		return orders.stream()
				.filter(order -> order.getOrderDate().isBefore(date))
				.toList();
	}

	//    Alakítsd át az alábbi metódus utasításait egy stream-mé!
	public void addProductToOrders(String status, Product product) {

		orders.stream()
				.filter(order -> order.getStatus().equals(status))
				.forEach(order -> order.addProduct(product));
	}

	//    Add vissza a paraméterként megadott kategóriájú termékeket!
	public List<Product> listProductsByCategory(String category) {
		return orders.stream()
				.flatMap(order -> order.getProducts().stream())
				.distinct()
				.filter(product -> product.getCategory().equals(category))
				.toList();
	}

	// Add vissza a megadott árnál drágább termékeket!
	public List<Product> listProductsOverPrice(double price) {
		return orders.stream()
				.flatMap(order -> order.getProducts().stream())
				.distinct()
				.filter(product -> product.getPrice() > price)
				.toList();
	}

	//    Alakítsd át az alábbi metódus utasításait egy stream-mé!
	public List<String> listProductsCategories() {

		return orders.stream()
				.flatMap(order -> order.getProducts().stream())
				.distinct()
				.map(Product::getCategory)
				.distinct()
				.toList();
	}

	//    Alakítsd át az alábbi metódus utasításait egy stream-mé!
	public double getProductsPricesAverage() {

		return orders.stream()
				.flatMap(order -> order.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.average()
				.orElseThrow(() -> new IllegalArgumentException("No products"));
	}

	//    Add vissza az összes terméket egy ehhez hasonló szöveges formában: "termék neve : termék ára"
	public List<String> getProductsInText() {
		return orders.stream()
				.flatMap(order -> order.getProducts().stream())
				.distinct()
				.map(product -> product.getName() + " : " + product.getPrice())
				.toList();
	}

	//    Add vissza a leghosszabb nevű termék nevét!
	public String getLongestProductName() {
		return orders.stream()
				.flatMap(order -> order.getProducts().stream())
				.distinct()
				.map(Product::getName)
				.min((name, other) -> Integer.compare(other.length(), name.length()))
				.orElseThrow(() -> new IllegalArgumentException("No products"));
	}
}
