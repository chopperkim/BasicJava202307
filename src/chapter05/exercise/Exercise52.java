package chapter05.exercise;

import java.util.Random;

public class Exercise52 {
    public static void main(String[] args) {
        // 1부터 45까지의 숫자를 배열에 담기
        int[] numbers = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45
        };

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        Random random = new Random();
        // 배열의 데이터 섞기
        for (int i = 0; i < numbers.length; i++) {
            int ranNum = random.nextInt(45);
            int temp = numbers[i];
            numbers[i] = numbers[ranNum];
            numbers[ranNum] = temp;
        }
        // 배열의 앞에서부터 6개의 숫자 추출
        for (int i = 0; i < 6; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
    }
}
