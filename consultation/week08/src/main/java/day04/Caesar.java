package day04;

public class Caesar implements Encryption {

	private int offset;

	public Caesar(int offset) {
		this.offset = offset;
	}

	@Override
	public String encrypt(String input) {
		StringBuilder res = new StringBuilder();
		String lowerCaseInput = input.toLowerCase();
		for (int i = 0; i < lowerCaseInput.length(); i++) {
			char actual = lowerCaseInput.charAt(i);
			if (actual >= 97 && actual <= 122) {
				res.append((char) ((actual - 97 + offset) % 26 + 97));
			} else {
				res.append(actual);
			}
		}
		return res.toString();
	}
}
