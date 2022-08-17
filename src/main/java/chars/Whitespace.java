package chars;

public class Whitespace {

	public String makeWhitespaceToStar(String text) {
		String res = "";
		for (char c : text.toCharArray()) {
			if (Character.isWhitespace(c)) {
				c = '*';
			}
		}
		return text;
	}
}
