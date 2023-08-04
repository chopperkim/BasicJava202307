package chapter11.exercise;


public class CheckingAccount extends BankAccount {
    private SavingsAccount protectedBy;

    public CheckingAccount(int balance) {
        super(balance);
    }

    public CheckingAccount(int balance, SavingsAccount protectedBy) {
        super(balance);
        this.protectedBy = protectedBy;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount > balance) {
            protectedBy.withdraw(amount - balance);
            balance = 0;
        } else {
            withdraw(amount);
        }
        return true;
    }

    @Override
    public String getAccountType() {
        return "당좌예금";
    }
}
