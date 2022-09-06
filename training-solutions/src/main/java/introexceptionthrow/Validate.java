package introexceptionthrow;

public class Validate {

    public void ValidateName(String name) {
        if (name == null || "".equals(name.strip())) {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
    }

    public void validateAge(String ageText) {
        for (int i = 0; i < ageText.length(); i++) {
            if (Character.isAlphabetic(ageText.charAt(i))) {
                throw new IllegalArgumentException("Input can only contains digits");
            }
        }

        if ("".equals(ageText.strip())) {
            throw new IllegalArgumentException("Input cannot be empty");
        }
        int age = Integer.parseInt(ageText);
        if (age > 120 || age < 0) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
    }
}
