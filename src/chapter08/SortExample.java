package chapter08;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        // 정렬 알고리즘
        int[] numbers = {1, 6, 2, 8, 100, 22, 3, 1, 87};
        String[] names = {"홍길동", "이순신", "신용권", "임경균"};
        Student[] students = {
                new Student("김인교", 1, 17),
                new Student("김승원", 2, 32),
                new Student("강성훈", 3, 25),
                new Student("정예훈", 4, 20),
                new Student("조인준", 5, 31),
                new Student("박상현", 6, 35),
                new Student("김성민", 7, 19),
                new Student("김준혁", 8, 22),
                new Student("이지용", 9, 29),
                new Student("권순옥", 10, 27),
        };
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);
        System.out.println("변경 후");
        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(students));

    }
}
