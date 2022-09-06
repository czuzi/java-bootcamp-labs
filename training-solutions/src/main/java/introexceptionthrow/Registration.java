package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Validate validate = new Validate();
        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        try {
            validate.ValidateName(name);
        } catch (IllegalArgumentException iae) {
            isValid = false;
            System.out.println(iae.getMessage());
        }

        System.out.println("Enter your age:");
        String ageText = sc.nextLine();
        try {
            validate.validateAge(ageText);
            System.out.println(ageText);
        } catch (IllegalArgumentException iae) {
            isValid = false;
            System.out.println(iae.getMessage());
        }

        if (isValid) {
            System.out.println(name + " " + ageText);
        } else {
            System.out.println("Invalid registration");
        }

    }
}
