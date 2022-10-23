package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username (mandatory):");
        String username = scanner.nextLine();
        System.out.println("Is your input met the requirements? " + userValidator.isValidUsername(username));

        System.out.println("Enter your password twice:");
        String password1 = scanner.nextLine();
        String password2 = scanner.nextLine();
        System.out.println("Is your passwords match? " + userValidator.isValidPassword(password1, password2));

        System.out.println("Enter your email (must be valid):");
        String email = scanner.nextLine();
        System.out.println("Is your email seems to be valid? " + userValidator.isValidEmail(email));
    }

}
