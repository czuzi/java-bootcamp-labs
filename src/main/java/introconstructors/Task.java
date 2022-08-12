package introconstructors;

import java.time.LocalDateTime;

public class Task {

	private String name;
	private String description;
	private LocalDateTime startDateTime;
	private int duration;

	public Task(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void start() {
		startDateTime = LocalDateTime.now();
	}

	public static void main(String[] args) {
		Task task = new Task("task 1", "important task");
		task.start();
		System.out.println(task.getStartDateTime());
	}
}
