package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GentlemanTest {

	Gentleman gentleman = new Gentleman();
	@Test
	void testSayHello() {
		assertEquals("Hello John Doe", gentleman.sayHello("John Doe"));
	}

	@Test
	void testSayHelloWithNull() {
		assertEquals("Hello Anonymous", gentleman.sayHello(null));
	}
}