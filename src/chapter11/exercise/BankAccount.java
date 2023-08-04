package chapter11.exercise;

// 계좌
public abstract class BankAccount {
    // 잔액
    protected int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    // 입금
    public void deposit(int amount) {
        this.balance += amount;
    }
    // 출금
    public boolean withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    // 이체
    public boolean transfer(int amount, BankAccount otherAccount) {
        if (amount < 0 || amount > balance) {
            throw new IllegalArgumentException();
        }
        if (otherAccount == null) {
            throw new NullPointerException();
        }
        if (withdraw(amount)) {
            otherAccount.deposit(amount);
            return true;
        }
        return false;
    }

    public abstract String getAccountType();

    @Override
    public String toString() {
        return String.format("%,d", getBalance());
    }
}
