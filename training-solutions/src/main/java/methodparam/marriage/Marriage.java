package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

	public void getMarried(Woman woman, Man man) {
		setMarriedName(woman, man);
		setDateOfMarriage(woman, man);
	}

	private static void setDateOfMarriage(Woman woman, Man man) {
		man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
		woman.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
	}

	private static void setMarriedName(Woman woman, Man man) {
		String husbandLastName = man.getName().split(" ")[0];
		woman.setName(husbandLastName + "-" + woman.getName());
	}
}
