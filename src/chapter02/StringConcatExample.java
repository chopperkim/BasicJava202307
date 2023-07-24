package chapter02;

public class StringConcatExample {
    public static void main(String[] args) {
        // + 연산자
        int result1 = 10 + 2 + 8;
        String result2 = 10 + 2 + "8";
        // 숫자를 문자로 캐스팅
//        숫자 뒤에 큰따옴표를 더한다.
        int a = 10;
        String str = a + "";
        // 문자를 숫자로 캐스팅
        String value = "100";
        int i = Integer.parseInt(value);
        double v = Double.parseDouble(value);
    }

}
