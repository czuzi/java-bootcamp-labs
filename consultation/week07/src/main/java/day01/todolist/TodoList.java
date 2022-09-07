package day01.todolist;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TodoList {

	private List<Todo> todos = new ArrayList<>();

	public void createToDoListFormFile(Path path) {
		try {
			readFile(path);
		} catch (IOException ioe) {
			throw new IllegalArgumentException("Illegal path" + path);
		}
	}

	private void readFile(Path path) throws IOException {
		Scanner sc = new Scanner(path);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] temp = line.split(";");
			todos.add(new Todo(LocalDate.parse(temp[0]), new ArrayList<>(Arrays.asList(temp[1].split(",")))));
		}
	}

	public List<Todo> getTodos() {
		return todos;
	}
}
