package composition.person;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person("jophn doe", "4644564");
		person.moveTo("mo", "nyh", "petofi 33", "3344");
		System.out.println(person.getAddress().addressToString());
	}
}
