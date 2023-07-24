package chapter04;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int num = random.nextInt(6) + 1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
