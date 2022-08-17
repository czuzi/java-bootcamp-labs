package chars;

public class Words {

	public static void main(String[] args) {
		Words words = new Words();
		System.out.println(words.pushWord("abba"));
	}

	public String pushWord(String word) {
		String res = "";
		for (char c: word.toCharArray()) {
			res += (char)(c + 1);
		}
		return res;
	}
}
