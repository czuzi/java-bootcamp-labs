package day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

	OrderService orderService;

	@BeforeEach
	void init() {
		orderService = new OrderService();

		Product p1 = new Product("Tv", "IT", 2000);
		Product p2 = new Product("Laptop", "IT", 2400);
		Product p3 = new Product("Phone", "IT", 400);
		Product p4 = new Product("Lord of The Rings", "Book", 20);
		Product p5 = new Product("Harry Potter Collection", "Book", 120);

		Order o1 = new Order("pending", LocalDate.of(2021, 6, 7));
		o1.addProduct(p1);
		o1.addProduct(p2);
		o1.addProduct(p5);

		Order o2 = new Order("on delivery", LocalDate.of(2021, 6, 1));
		o2.addProduct(p3);
		o2.addProduct(p1);
		o2.addProduct(p2);

		Order o3 = new Order("pending", LocalDate.of(2021, 6, 7));
		o3.addProduct(p1);
		o3.addProduct(p2);
		o3.addProduct(p5);

		Order o4 = new Order("pending", LocalDate.of(2021, 6, 1));
		o4.addProduct(p3);
		o4.addProduct(p1);
		o4.addProduct(p2);

		Order o5 = new Order("pending", LocalDate.of(2021, 6, 7));
		o5.addProduct(p1);
		o5.addProduct(p2);
		o5.addProduct(p5);

		orderService.saveOrder(o1);
		orderService.saveOrder(o2);
		orderService.saveOrder(o3);
		orderService.saveOrder(o4);
		orderService.saveOrder(o5);
	}

	@Test
	void testGetOrdersByStatusAndDate() {
		List<Order> expected = orderService.getOrdersByStatusAndDate("pending", LocalDate.of(2021, 6, 7));

		assertEquals(3,  expected.size());
	}

	@Test
	void testGetNumberOfOrdersByStatus() {
		assertEquals(4, orderService.getNumberOfOrdersByStatus("pending"));
	}

	@Test
	void testIsOrderWithProductsLessThanGiven() {
		assertTrue(orderService.isOrderWithProductsLessThanGiven(4));
		assertFalse(orderService.isOrderWithProductsLessThanGiven(2));
	}

	@Test
	void testListOrderDates() {
		List<LocalDate> expected = orderService.listOrderDates();

		assertEquals(2, expected.size());
		assertTrue(expected.contains(LocalDate.of(2021, 6, 1)));
		assertTrue(expected.contains(LocalDate.of(2021, 6, 7)));
	}

	@Test
	void testGetMaxProducts() {
		assertEquals(3, orderService.getMaxProducts());
	}

	@Test
	void testListOrdersByOrderDate() {
		List<Order> expected = orderService.listOrdersByOrderDate();

		assertEquals(5, expected.size());
		assertEquals(LocalDate.of(2021, 6, 1), expected.get(1).getOrderDate());
		assertEquals(LocalDate.of(2021, 6, 7), expected.get(3).getOrderDate());
	}

	@Test
	void testListOrdersBeforeDate() {
		List<Order> expected = orderService.listOrdersBeforeDate(LocalDate.of(2021, 6, 5));

		assertEquals(2, expected.size());
	}

	@Test
	void testAddProductToOrders() {
		orderService.addProductToOrders("on delivery", new Product("phone", "IT", 300));

		assertEquals(4, orderService.getOrders().get(1).getProducts().size());
	}

	@Test
	void testListProductsByCategory() {
		List<Product> expected = orderService.listProductsByCategory("IT");

		assertEquals(3, expected.size());
	}

	@Test
	void testListProductsOverPrice() {
		List<Product> expected = orderService.listProductsOverPrice(1500);

		assertEquals(2, expected.size());
	}

	@Test
	void testListProductsCategories() {
		List<String> expected = orderService.listProductsCategories();

		assertEquals(2, expected.size());
		assertTrue(expected.contains("IT"));
		assertTrue(expected.contains("Book"));
	}

	@Test
	void testGetProductsPricesAverage() {
		assertEquals(1544.0, orderService.getProductsPricesAverage());
	}

	@Test
	void testGetProductsInText() {
		List<String> expected = orderService.getProductsInText();

		assertEquals(4, expected.size());
		assertTrue(expected.contains("Phone : 400.0"));
	}

	@Test
	void testGetLongestProductName() {
		assertEquals("Harry Potter Collection", orderService.getLongestProductName());
	}
}