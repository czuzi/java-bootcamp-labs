package day03;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

	private List<Person> people = new ArrayList<>();

	public void addPerson(Person person, LocalTime time) {
		LocalTime entryTime = person.getTicket().entry();
		if (time.isBefore(entryTime)) {
			throw new IllegalArgumentException("You cant go in yet" + entryTime);
		}
		people.add(person);
	}

	public List<Person> getPeople() {
		return people;
	}
}
