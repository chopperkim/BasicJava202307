package chapter02;

public class FloatDoubleExample {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println(var1);
        System.out.println(var2);
        // 지수 표현식
        // 100 => 1.0 * 10^2
        // 0.0000123 => 1.23 * 10^-5
        double var3 = 1.0e2;
        double var4 = 1.23e-5;
        System.out.println(var3);
        System.out.println(var4);

    }
}
