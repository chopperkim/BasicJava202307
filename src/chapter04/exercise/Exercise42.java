package chapter04.exercise;

import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입력하세요(1~12): ");
        int month = scanner.nextInt();
        String result = switch (month) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12, 1, 2 -> "겨울";
            default -> "잘못된 입력";
        };
        System.out.printf("%d월은 %s입니다.", month, result);
    }
}
