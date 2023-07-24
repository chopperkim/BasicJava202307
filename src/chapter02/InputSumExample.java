package chapter02;

import java.util.Scanner;

public class InputSumExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 수: ");
        int firstNumber = scanner.nextInt();
        System.out.print("두번째 수: ");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println("덧셈 결과: " + result);
    }
}
