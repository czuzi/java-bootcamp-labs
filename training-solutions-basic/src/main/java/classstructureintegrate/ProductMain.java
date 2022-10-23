package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to increase or decrease with: ");
        int value = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Type \"increase\" or \"decrease\" to select method");
        String selectedMethod = scanner.nextLine();

        Product product = new Product("ipad", 399);

        if ("increase".equals(selectedMethod)) {
            product.increasePrice(value);
        } else if ("decrease".equals(selectedMethod)) {
            product.decreasePrice(value);
        } else {
            System.out.println("Invalid method");
        }

        System.out.println("The price of the " + product.getName() + " is " + product.getPrice());

    }
}
