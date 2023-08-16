package chapter16;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "홍길동";
        String b = "김길동";
        int result = comparable.compare(a, b);
        if (result < 0) {
            System.out.printf("%s은 %s보다 앞에 옵니다.\n", a, b);
        } else if (result == 0) {
            System.out.printf("%s은 %s와 같습니다.\n", a, b);
        } else {
            System.out.printf("%s은 %s보다 뒤에 옵니다.\n", a, b);
        }
    }
}
