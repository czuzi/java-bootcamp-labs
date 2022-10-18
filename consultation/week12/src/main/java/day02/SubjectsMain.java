package day02;

import java.nio.file.Path;

public class SubjectsMain {

	public static void main(String[] args) {
		SubjectService subjectService = new SubjectService();

		subjectService.readFile(Path.of("src/main/resources/beosztas.txt"));

		System.out.println(subjectService.sumOfLessons("Albatrosz Aladin"));
	}
}
