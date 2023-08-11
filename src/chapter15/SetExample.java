package chapter15;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> subjects = new HashSet<>();
        subjects.add("Java");
        subjects.add("JDBC");
        subjects.add("JSP");
        subjects.add("java");
        subjects.add("Spring");
        subjects.add("jsp");
        subjects.add("Spring");

        System.out.println("총 개수: " + subjects.size());

        // Set의 데이터 가져오는 방법
        // 1. Iterator(반복자)를 통해 가져오기
        Iterator<String> iterator = subjects.iterator();
        while (iterator.hasNext()) {
            String subject = iterator.next();
            System.out.println(subject);
        }

        System.out.println("foreach문을 통해 출력");
        // 2. foreach문을 통해 가져오기
        for (String subject : subjects) {
            System.out.println(subject);
        }

    }
}
