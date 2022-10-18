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
		} catch (IOException e) {
			throw new IllegalArgumentException("Cannot read file",e);
		} catch (NumberFormatException nfe) {
			throw  new IllegalArgumentException("File is not valid",nfe);
		}
	}
}
