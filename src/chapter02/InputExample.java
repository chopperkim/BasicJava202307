package chapter02;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // 사용자로부터 데이터 입력받기
        Scanner scanner = new Scanner(System.in);
//        scanner.next(); // 문자열
        int number = scanner.nextInt();// 정수
//        scanner.nextDouble(); // 실수
        System.out.println("사용자가 입력한 숫자: " + number);

    }
}
