package consultations.w01d05;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first side: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter the other side: ");
        int y = scanner.nextInt();
        scanner.nextLine();
        Rectangle rectangle = new Rectangle(x, y);
        System.out.println(rectangle.calculateArea());
    }
}
