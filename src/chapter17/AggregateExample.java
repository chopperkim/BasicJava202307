package chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class AggregateExample {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(38, 96, 16, 3, 76, 94, 82, 47, 59, 8);
//        list.stream();
        int[] array = {38, 96, 16, 3, 76, 94, 82, 47, 59, 8};
        int asInt = Arrays.stream(array).max().getAsInt();
        System.out.println(asInt);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("합계: " + sum);
        int sum1 = Arrays.stream(array).sum();
        System.out.println("합계: " + sum1);

        Arrays.stream(array).findFirst().getAsInt();
        Arrays.stream(array).findAny().getAsInt();

    }
}
