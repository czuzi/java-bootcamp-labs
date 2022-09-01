package consultations.w02d05;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random rnd = new Random();
        int targetNumber = rnd.nextInt(100);
        System.out.println(targetNumber);
        System.out.println("I have a number in my mind. Can you guess it in six  tries?");

        Scanner sc = new Scanner(System.in);
         for (int i = 0; i < 6; i++) {
             System.out.print("Enter your guess: ");
             int guess = sc.nextInt();
             if (guess > targetNumber) {
                 System.out.println("My number is lower than yours! You have " + (5 - i) + " guesses remaining");
             } else if (guess < targetNumber) {
                 System.out.println("My number is bigger than yours! You have " + (5 - i) + " guesses remaining");
             } else {
                 System.out.println("You got it!");
                 return;
             }
         }
        System.out.println("Out of guesses.");

    }
}
