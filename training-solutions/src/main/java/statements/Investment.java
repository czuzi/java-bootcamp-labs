package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public double getYield(int days) {
        return fund * (interestRate / 100.) / 365 * days;
    }

    public double close(int days) {
        double total = fund + getYield(days) * (1 - cost / 100);
        double result = active ? total : 0;
        active = false;
        return result;
    }
}
