package chars;

public class Whitespace {

	public static void main(String[] args) {
		Whitespace whitespace = new Whitespace();
		System.out.println(whitespace.makeWhitespaceToStar("asm f asdf as gd asdf asdf"));
	}

	public String makeWhitespaceToStar(String text) {
		String res = "";
		for (char c : text.toCharArray()) {
			if (Character.isWhitespace(c)) {
				res += '*';
			} else {
				res += c;
			}
		}
		return res;
	}
}
