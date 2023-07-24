package chapter06;

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();
        b1.deposit(10_000);
        System.out.println("b1의 잔액: " + b1.balance);
        b2.withdraw(5_000);
        System.out.println("b2의 잔액: " + b2.balance);
        System.out.println("b3의 잔액: " + b3.balance);

    }
}
