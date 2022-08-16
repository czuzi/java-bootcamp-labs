package consultations.w04d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {
	@Test
	void isValidNameTrue() {
		NameValidator nameValidator = new NameValidator();
		assertTrue(nameValidator.isValidName("John Doe"));
	}

	@Test
	void isValidNameFalseFirstName() {
		NameValidator nameValidator = new NameValidator();
		assertFalse(nameValidator.isValidName("john Doe"));
	}
	@Test
	void isValidNameFalseLastName() {
		NameValidator nameValidator = new NameValidator();
		assertFalse(nameValidator.isValidName("John doe"));
	}
	@Test
	void isValidNameTrueMultipleNames() {
		NameValidator nameValidator = new NameValidator();
		assertTrue(nameValidator.isValidName("John Doe Smith"));
	}
}