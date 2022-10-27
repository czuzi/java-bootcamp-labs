package day03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassNoteBook {

	private Map<String, List<Integer>> studentListMap = new HashMap<>();

	public Map<String, List<Integer>> getStudentListMap() {
		return studentListMap;
	}

	public void addStudent(Student student) {
		studentListMap.put(student.getStudentId(), new ArrayList<>());
	}

	public void addMark(String id, int mark) {
		if (studentListMap.get(id) == null) {
			throw new IllegalStateException("Id does not exist: " + id);
		}
		studentListMap.get(id).add(mark);
	}
}
