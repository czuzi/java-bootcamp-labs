package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

	private List<String> students = Arrays.asList("Gárdos Helga", "Joó Lilla", "Kiss József", "Nagy Béla",
			"Németh Dóra", "Pongrácz Imola", "Rendes Richárd", "Szabó Nóra", "Takács Júlia", "Vígh Elemér");


	public String getTodayReferringStudent(int i) {
		return students.get(i-1);
	}


	public String getTodayReferringStudent(Number number) {
		return students.get(number.getValue() -1);
	}


	public String getTodayReferringStudent(String numberStr) {
		return students.get(Number.valueOf(numberStr.toUpperCase()).getValue()-1);
	}
}
