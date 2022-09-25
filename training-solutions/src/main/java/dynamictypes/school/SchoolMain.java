package dynamictypes.school;

public class SchoolMain {

	public static void main(String[] args) {
		School school = new School("school", 0);
		School primarySchool = new PrimarySchool("primary school", 8);
		School secondarySchool = new SecondarySchool("secondary school", 4);

		System.out.println(school);
		System.out.println(primarySchool);
		System.out.println(secondarySchool);
	}
}
