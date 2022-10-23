package introexceptionthrow.patient;

public class Patient {

    private final String name;
    private final String socialSecurityNumber;
    private final int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        this.name = validateName(name);
        if (new Snn().isValidSnn(socialSecurityNumber)) {
            this.socialSecurityNumber = socialSecurityNumber;
        } else {
            throw new IllegalArgumentException("snn is not valid");
        }
        this.yearOfBirth = validateYearOfBirth(yearOfBirth);
    }

    public static void main(String[] args) {
        Patient patient = new Patient("john", "111111110", 1922);
        System.out.println(patient);
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

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
