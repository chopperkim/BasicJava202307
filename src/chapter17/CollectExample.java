package chapter17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectExample {
    public static void main(String[] args) {
        List<String> strings = IntStream.range(0, 10).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.toList());
        strings.forEach(System.out::println);
    }
}
