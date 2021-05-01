package TestPractice;

public class CreditLimitCalculator {
    private  double totalLiability;
    private  int credit;
    private int newBalance;
    public double liabilty(double tax, double exp, double debt) {
        totalLiability = tax + exp + debt;
        return totalLiability;
    }

    public int totalCredit(int salary, int charge) {
        credit = salary + charge;
        return credit;
    }

    public int displayNewBalance(int initial_balance, int charge, int totalLiability) {
        this.totalLiability = totalLiability;
        newBalance = initial_balance + charge - totalLiability;
        return newBalance;
    }

    public int newCreditLimit(int newBalance) {
        this.newBalance = newBalance;
        return newBalance/10;
    }
}
