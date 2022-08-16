package consultations.w04d02;

public class NameValidator {

	public boolean isValidName(String name) {
		String[] nameArray = name.split(" ");
		if (nameArray.length < 2) {
			return false;
		}
		for (String namePart: nameArray) {
			if (namePart.split("")[0].equals(namePart.split("")[0].toLowerCase())) {
				return false;
			}
		}
		return true;
	}
}
