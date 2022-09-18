package algorithmstransformation.students;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

	private List<Person> people;

	public PrimarySchool(List<Person> people) {
		this.people = new ArrayList<>(people);
	}

	public List<Person> getPeople() {
		return people;
	}

	public void addPerson(Person person) {
		people.add(person);
	}

	public List<Student> getStudents() {
		List<Student> res = new ArrayList<>();
		for (Person person: people) {
			if (person.getAge() >= 6 && person.getAge() <= 14) {
				res.add(new Student(person.getName(), person.getAddress()));
			}
		}
		return res;
	}
}
