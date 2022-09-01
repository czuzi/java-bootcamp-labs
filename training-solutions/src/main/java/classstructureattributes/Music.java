package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Tell me your favourite song!");
        System.out.println("Band/artist:");
        song.band = scanner.nextLine();

        System.out.println("Title of the song:");
        song.title = scanner.nextLine();

        System.out.println("Length of the song:");
        song.length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your favourite song is " + song.title + " by " + song.band + " (" + song.length + " minutes)");
    }
}
