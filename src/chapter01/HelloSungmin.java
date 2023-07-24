package chapter01;

import java.util.Scanner;

public class HelloSungmin {
    public static void main(String[] args) {
        /*
        원기둥 밑면의 반지름과 높이를 입력 받아서
        밑면의 넓이와 부피를 계산하는 프로그램을 작성하여 보자.
        원주율은 Math.PI를 사용한다.
        */
        // 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("원기둥 밑면의 반지름(cm): ");
        // 엔터를 입력할 때까지의 사용자 데이터를 가져온다.
        double radius = scanner.nextDouble();
        System.out.println("원기둥의 높이(cm): ");
        double height = scanner.nextDouble();
        // 처리
        // 밑면의 넓이
        double area = Math.PI * radius * radius;
        // 원기둥의 부피
        double volume = area * height;
        // 출력
        System.out.println("원기둥의 넓이: " + area + "㎠이고, 부피는 " + volume + "㎤이다.");
    }
}
