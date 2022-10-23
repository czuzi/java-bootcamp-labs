package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todo {

	public static void main(String[] args) {
		List<String> todos = new ArrayList<>();
		boolean toContinue = true;
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.println("Enter a todo, or enter x to exit");
			input = sc.nextLine();
			toContinue = evaluateInput(todos, toContinue, input);
		}
		while (toContinue);
	}

	private static boolean evaluateInput(List<String> todos, boolean toContinue, String input) {
		if (!"x".equalsIgnoreCase(input)) {
			todos.add(input);
		} else {
			toContinue = false;
			writeFile(todos);
		}
		return toContinue;
	}

	private static void writeFile(List<String> todos) {
		try {
			Files.write(Path.of("src/main/resources/todos.txt"), todos);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
