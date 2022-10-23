package day04.landregistry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LocalGovernmentTest {

	LocalGovernment localGovernment;

	@BeforeEach
	void init() {
		localGovernment = new LocalGovernment();
		localGovernment.readGroundsFromFile(Paths.get("src/test/resources/utca_test.txt"));
	}

	@Test
	void testReadGroundsFromFile() {
		assertEquals(11, localGovernment.getGrounds().size());
	}

	@Test
	void testCollectStreetsWithDifferentTaxCategories() {
		Set<String> streets = Set.of("Kurta", "Malom");

		assertEquals(streets, localGovernment.collectStreetsWithDifferentTaxCategories());
	}

	@Test
	void testGetTaxAmountsByOwners() {
		Map<Owner, Integer> taxAmounts = localGovernment.getTaxAmountsByOwners();

		assertEquals(8, taxAmounts.size());
		assertEquals(7900, taxAmounts.get(new Owner("81752")));
		assertEquals(104900, taxAmounts.get(new Owner("48154")));
		assertEquals(154900, taxAmounts.get(new Owner("96094")));
	}
}