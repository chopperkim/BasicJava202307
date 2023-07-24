package chapter06;

// 계좌번호
public class BankAccount {
    // 잔액
    static int balance;
    // 입금
    void deposit(int amount) {
        balance += amount;
    }
    // 출
    void withdraw(int amount) {
        balance -= amount;
    }
}
