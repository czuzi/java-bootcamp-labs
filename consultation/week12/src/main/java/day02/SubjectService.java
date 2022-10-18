package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {

	private List<Subject> subjects = new ArrayList<>();

	public void readFile(Path path) {
		try (BufferedReader br = Files.newBufferedReader(path)) {
			String line;
			while ((line = br.readLine()) != null) {
				Subject subject = processBlock(line, br);
				subjects.add(subject);
			}
		} catch (IOException e) {
			throw new IllegalArgumentException("Cannot read file",e);
		} catch (NumberFormatException nfe) {
			throw  new IllegalArgumentException("File is not valid",nfe);
		}
	}

	private Subject processBlock(String line, BufferedReader br) throws IOException {
		String teacher = line;
		String subjectName = br.readLine();
		String group = br.readLine();
		int numberOfLessons = Integer.parseInt(br.readLine());
		return new Subject(teacher,subjectName,group,numberOfLessons);
	}

	public int sumOfLessons(String teacherName) {
		int sum = 0;
		for (Subject actual : subjects) {
			if (actual.getTeacher().equals(teacherName)) {
				sum += actual.getNumberOfLessons();
			}
		}
		if(sum==0){
			throw new CannotFindTeacherException("Name is invalid!");
		}
		return sum;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}
}
