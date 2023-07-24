package chapter02;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 20;
        int result = v1 + v2;

        byte v3 = 10;
        byte v4 = 20;
        byte result2 = (byte) (v3 + v4);

        int v5 = 1;
        int v6 = 2;
        double result3 = (double) v5 / v6;
        System.out.println(result3);

    }
}
