package collectionsclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exam {

	private List<ExamResult> results;

	public Exam(List<ExamResult> results) {
		this.results = results;
	}

	public List<String> getNamesOfSucceededPeople(int places) {
		List<String> result = new ArrayList<>();
		List<ExamResult> sorted = new ArrayList<>(results);
		sorted.sort(Comparator.comparing(ExamResult::getPoints).reversed());
		for (int i = 0; i < places; i++) {
			result.add(sorted.get(i).getName());
		}
		return result;
	}
}
