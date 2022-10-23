package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable {

	private List<String> tasks = new ArrayList<>();

	public SimpleTasks(List<String> tasks) {
		this.tasks = tasks;
	}

	public List<String> getTasks() {
		return tasks;
	}

	private void nextStep() {
		tasks.remove(tasks.size()-1);
	}

	@Override
	public void run() {
		while (!tasks.isEmpty()) {
			nextStep();
		}
	}
}
