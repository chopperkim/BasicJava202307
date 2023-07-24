package chapter06.confirm;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accounts = new Account[100];
        int totalCount = 0;
        Scanner scanner = new Scanner(System.in);
        outer: while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1 -> {
                    System.out.println("--------");
                    System.out.println("계좌생성");
                    System.out.println("--------");
                    System.out.print("계좌번호: ");
                    String number = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String holder = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(scanner.nextLine());
                    accounts[totalCount++] = new Account(number, holder, balance);
                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case 2 -> {
                    System.out.println("------------------------------");
                    System.out.println("          계좌목록");
                    System.out.println("------------------------------");
                    System.out.println("계좌번호\t계좌주\t잔액");
                    for (Account account : accounts) {
                        if (account != null) {
                            System.out.printf("%s\t%s\t%,d\n", account.getNumber(), account.getHolder(), account.getBalance());
                        }
                    }
                }
                case 3 -> {
                    System.out.println("----");
                    System.out.println("----");
                    System.out.println("예금");
                    System.out.println("----");
                    System.out.print("계좌번호: ");
                    String searchNumber = scanner.nextLine();
                    System.out.print("예금액: ");
                    int amount = Integer.parseInt(scanner.nextLine());

                    for (Account account : accounts) {
                        if (account != null) {
                            if (account.getNumber().equals(searchNumber)) {
                                account.deposit(amount);
                            }
                        }
                    }
                    System.out.println("입금이 완료되었습니다.");
                }
                case 4 -> {
                    System.out.println("----");
                    System.out.println("출금");
                    System.out.println("----");
                    System.out.print("계좌번호: ");
                    String searchNumber = scanner.nextLine();
                    System.out.print("출금액: ");
                    int amount = Integer.parseInt(scanner.nextLine());

                    for (Account account : accounts) {
                        if (account != null) {
                            if (account.getNumber().equals(searchNumber)) {
                                account.withdraw(amount);
                            }
                        }
                    }
                    System.out.println("출금이 완료되었습니다.");
                }
                case 5 -> {
                    break outer;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
