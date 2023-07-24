package chapter02;

import java.util.Scanner;

public class InputStringExample {
    public static void main(String[] args) {
        /*
        콘솔에 결과 출력
        이름: 홍길동
        나이: 25
        전화: 010-1234-5678
         */
        // 입력 부분
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scanner.next();
        System.out.print("나이를 입력하세요: ");
        String age = scanner.next();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scanner.next();
        // 출력 부분
        System.out.println("이름: " + name);
        System.out.print("나이: " + age + "\n");
        System.out.printf("전화번호: %s", phoneNumber);
    }
}
