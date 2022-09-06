package introexceptionthrow.patient;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        this.name = validateName(name);
        if (new Snn().isValidSnn(socialSecurityNumber)) {
            this.socialSecurityNumber = socialSecurityNumber;
        } else {
            throw new IllegalArgumentException("snn is not valid");
        }
        this.yearOfBirth = validateYearOfBirth(yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String validateName(String name) {
        if ("".equals(name.strip())) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        return name;
    }

    public int validateYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Must be at least 1900");
        }
        return yearOfBirth;
    }
}
