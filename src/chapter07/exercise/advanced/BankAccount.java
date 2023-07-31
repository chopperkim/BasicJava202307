package chapter07.exercise.advanced;

// 계좌
public class BankAccount {
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
        if (withdraw(amount)) {
            otherAccount.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%,d", getBalance());
    }
}
