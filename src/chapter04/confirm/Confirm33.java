package chapter04.confirm;

public class Confirm33 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i+=3) {
//            if (i % 3 == 0) {
                sum += i;
//            }
        }
        System.out.println(sum);
    }
}
