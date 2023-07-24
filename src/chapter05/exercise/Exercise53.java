package chapter05.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("가위, 바위, 보를 입력하세요: ");
        String player = scanner.nextLine();

        String[] rsp = {"가위", "바위", "보"};
        Random random = new Random();
        String computer = rsp[random.nextInt(3)];

        String result = "";
        if (computer.equals(player)) {
            result = "비겼습니다.";
        } else if (computer.equals("가위") && player.equals("바위")
                || computer.equals("바위") && player.equals("보")
                || computer.equals("보") && player.equals("가위")) {
            result = "게이머 승리!";
        } else {
            result = "컴퓨터 승리!";
        }
        System.out.println("게이머: " + player);
        System.out.println("컴퓨터: " + computer);
        System.out.println("결과: " + result);
    }
}
