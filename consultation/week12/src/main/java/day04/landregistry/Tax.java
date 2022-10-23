package day04.landregistry;

public enum Tax {

	A(800), B(600), C(100);

	private final int value;

	Tax(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
