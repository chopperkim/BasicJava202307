package chapter04.confirm;

import java.util.Scanner;

public class Confirm37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int balance = 0;
        while (isRunning) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1 -> {
                    System.out.print("예금액> ");
                    balance += Integer.parseInt(scanner.nextLine());
                }
                case 2 -> {
                    System.out.print("출금액> ");
                    balance -= Integer.parseInt(scanner.nextLine());
                }
                case 3 -> System.out.println("잔고> " + balance);
                case 4 -> isRunning = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
