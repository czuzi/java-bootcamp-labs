package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {

	public void printStudyGroups(List<String> students) {
		for (String student : students) {
			if (student.length() <= 10) {
				System.out.println("First group!");
			} else {
				System.out.println("Second Group!");
			}
		}
	}

	public static void main(String[] args) {
		StudyGroup studyGroup = new StudyGroup();
		studyGroup.printStudyGroups(Arrays.asList("Rebeca", "asdgaswhasd", "wsadfwefsdfwef", "afdw"));
	}
}
