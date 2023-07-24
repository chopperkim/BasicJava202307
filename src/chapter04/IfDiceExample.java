package chapter04;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {
//        int num = (int)(Math.random() * 6) +1;
        // 랜덤을 만드는 방법
        Random random = new Random(8);

        int ranNum1 = random.nextInt(6) + 1;
        int ranNum2 = random.nextInt(6) + 1;
        int ranNum3 = random.nextInt(6) + 1;
        int ranNum4 = random.nextInt(6) + 1;
        int ranNum5 = random.nextInt(6) + 1;
        int ranNum6 = random.nextInt(6) + 1;
        int ranNum7 = random.nextInt(6) + 1;
        int ranNum8 = random.nextInt(6) + 1;
        System.out.println(ranNum1);
        System.out.println(ranNum2);
        System.out.println(ranNum3);
        System.out.println(ranNum4);
        System.out.println(ranNum5);
        System.out.println(ranNum6);
        System.out.println(ranNum7);
        System.out.println(ranNum8);
    }
}
