package chapter05;

import java.util.Arrays;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;
        // 조선시대
//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
        // 근현대
        for (int score : scores) {
            sum += score;
        }
        // 최근 트랜드
        // fori나 foreach를 쓰지 않는 방식 : 함수형 프로그래밍 방식
        // Stream API(JDK 1.8에 추가된 방식)
        sum = Arrays.stream(scores).sum();
        double avg = Arrays.stream(scores).average().getAsDouble();
        System.out.println(sum);
        System.out.println(avg);
    }
}
