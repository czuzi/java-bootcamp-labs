package day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.ref.Cleaner;

import static org.junit.jupiter.api.Assertions.*;

class ClientsTest {

	Clients clients = new Clients();

	@BeforeEach
	void init() {
		clients.addClient(new Client("John", "123"));
		clients.addClient(new Client("Jane", "124"));
		clients.addClient(new Client("Howard", "125"));
		clients.addClient(new Client("Jack", "126"));
		clients.addClient(new Client("Jenny", "127"));
	}

	@Test
	void testFindClientByRegNumber() {
		Client client = clients.findClientByRegNumber("123");
		assertEquals("John", client.getName());
	}

	@Test
	void testFindClientByRegNumberIndexOF() {
		Client client = clients.findClientByRegNumberIndexOf("123");
		assertEquals("John", client.getName());
	}
}