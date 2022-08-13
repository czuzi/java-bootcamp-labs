package references.parameters;

public class ReferencesMain {

	public static void main(String[] args) {
		Person person1;
		Person person2;

		person1 = new Person("kovacs bela", 66);
		person2 = person1;

		person2.setName("kovacs geza");
		System.out.println(person1.getName());
		System.out.println(person2.getName());

		int num1 = 13;
		int num2 = num1;

		num1++;
		num2++;

		System.out.println(num1);
		System.out.println(num2);
	}
}
