package chapter02;

import java.util.Scanner;

public class PhoneNumberExample {
    public static void main(String[] args) {
        /*
        전화번호를 세부분(010, 1234, 1234)으로 나누어 입력받고
        010-1234-1234로 출력하는 코드를 작성하시오.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 번호: ");
        String firstNumber = scanner.next();
        System.out.print("두번째 번호: ");
        String secondNumber = scanner.next();
        System.out.print("마지막 번호: ");
        String lastNumber = scanner.next();
        System.out.printf("%s-%s-%s", firstNumber, secondNumber, lastNumber);
        System.out.printf("010-0123-4512");
    }

}
