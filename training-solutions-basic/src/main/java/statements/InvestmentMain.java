package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fund to invest:");
        int fund = scanner.nextInt();

        System.out.println("Enter the interest rate");
        int interestRate = scanner.nextInt();

        System.out.println(fund);
        System.out.println(interestRate);

        Investment investment = new Investment(fund, interestRate);

        System.out.println(investment.getYield(50));
        System.out.println(investment.close(80));
        System.out.println(investment.close(90));
    }
}
