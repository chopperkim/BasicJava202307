package chapter08.exercise;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    public void updateBalance(int period) {
        this.balance += this.balance * interestRate * period;
    }

    @Override
    public String getAccountType() {
        return "저축예금";
    }
}
