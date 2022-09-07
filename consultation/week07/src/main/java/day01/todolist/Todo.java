package day01.todolist;

import java.time.LocalDate;
import java.util.List;

public class Todo {

    private LocalDate date;
    private List<String> tasks;

    public Todo(LocalDate dates, List<String> tasks) {
        this.date = dates;
        this.tasks = tasks;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
