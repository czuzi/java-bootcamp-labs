package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Message: ");

		List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
		for (String actual: codedMessage) {
			sb.append((char) Integer.parseInt(actual));
		}

		System.out.println(sb);

		StringBuilder sb2 = new StringBuilder("Another message: ");

		List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "101", "110", "101", "116", "46");

		for (String actual: anotherCodedMessage) {
			sb2.append((char) Integer.parseInt(actual));
		}
		System.out.println(sb2);
	}
}
