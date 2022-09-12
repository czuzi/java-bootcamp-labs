package introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private List<Integer> grades = new ArrayList<>();

	public List<Integer> getGrades() {
		return grades;
	}

	public void addGrade(int grade) {
		if (grade > 5 || grade < 1) {
			throw new IllegalArgumentException("Grade must be between 1 and 5");
		}
		grades.add(grade);
	}
}
