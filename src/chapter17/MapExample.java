package chapter17;

import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        IntStream.range(1, 10).mapToObj(operand -> {
            return 2 + " * " + operand + " = " + (operand * 2);
        }).forEach(System.out::println);
    }
}
