package day01.todolist;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {

	@Test
	void createTodoListFromFile() {
		TodoList todoList = new TodoList();
		todoList.createToDoListFormFile(Path.of("src/test/resources/todos.txt"));

		assertEquals(LocalDate.of(2022,9,6),todoList.getTodos().get(1).getDate());
		assertEquals(4, todoList.getTodos().size());
		assertEquals(3, todoList.getTodos().get(2).getTasks().size());
	}
}