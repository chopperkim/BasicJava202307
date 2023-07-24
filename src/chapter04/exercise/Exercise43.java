package chapter04.exercise;

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위, 바위, 보 게임");
        System.out.print("철수: ");
        String chulsoo = scanner.nextLine();
        System.out.print("영희: ");
        String yunghee = scanner.nextLine();
        String result = "";
        if (chulsoo.equals(yunghee)) {
            result = "비겼습니다.";
        } else if (chulsoo.equals("가위") && yunghee.equals("바위")
                || chulsoo.equals("바위") && yunghee.equals("보")
                || chulsoo.equals("보") && yunghee.equals("가위")) {
            result = "영희가 이겼습니다.";
        } else {
            result = "철수가 이겼습니다.";
        }
        System.out.println(result);
    }
}
