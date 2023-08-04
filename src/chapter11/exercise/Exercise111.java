package chapter11.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("어떤 수를 나누시겠습니까?");
                int dividend = scanner.nextInt();
                System.out.print("어떤 수로 나누시겠습니까?");
                int divisor = scanner.nextInt();
                int quotient = dividend / divisor;
                System.out.printf("%d / %d = %d", dividend, divisor, quotient);
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
            }
        }
        scanner.close();
    }
}
