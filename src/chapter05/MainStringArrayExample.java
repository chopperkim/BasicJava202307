package chapter05;
import java.lang.String;

public class MainStringArrayExample {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("매개값이 부족합니다.");
        } else {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
    }
}
