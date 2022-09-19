package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

	@Test
	void testCreateNameOnly() {
		Recipe recipe = new Recipe("apple pie");
		assertEquals("apple pie", recipe.getName());
		assertEquals(0, recipe.getIngredients().size());
		assertNull(recipe.getDescription());
	}

	@Test
	void testCreateWithNameAndDescription() {
		Recipe recipe = new Recipe("Muffin", "delicious");
		assertEquals("Muffin", recipe.getName());
		assertEquals("delicious", recipe.getDescription());
		assertEquals(0, recipe.getIngredients().size());
	}

	@Test
	void testAddIngredients() {
		Recipe recipe = new Recipe("Muffin", "delicious");
		recipe.addIngredient("flour");
		recipe.addIngredient("chocolate", "raisin");
		recipe.addIngredient("more chocolate", "orange", "rum");
		assertEquals(6, recipe.getIngredients().size());
		assertEquals("more chocolate", recipe.getIngredients().get(3));
	}
}