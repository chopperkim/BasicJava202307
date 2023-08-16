package chapter17;

import chapter16.Comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");
//        List<String> tempList = new ArrayList<>();
//        for (String s : list) {
//            if (!tempList.contains(s)) {
//                tempList.add(s);
//            }
//        }
//        for (String s : tempList) {
//            System.out.println(s);
//        }

//        list.stream().distinct().forEach(System.out::println);

        // list에서 신으로 시작하는 이름만 출력하시오.
//        List<String> tempList = new ArrayList<>();
        // 옛날 방식
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).startsWith("신")) {
//                tempList.add(list.get(i));
//            }
//        }
        // 요즘 방식
//        for (String s : list) {
//            if (s.startsWith("신") && !tempList.contains(s)) {
//                tempList.add(s);
//            }
//        }
//        for (String s : tempList) {
//            System.out.println(s);
//        }
//        list.stream().distinct().filter(s -> s.startsWith("신")).forEach(System.out::println);
//        list.forEach(System.out::println);

    }
}
