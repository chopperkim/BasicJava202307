package chapter12.confirm;

public class StringBuilderExample {
    public static void main(String[] args) {
//        String str = "";
//        for (int i = 1; i <= 100; i++) {
//            str += i;
//        }
//        System.out.println(str);

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            builder.append(i);
        }
        System.out.println(builder);
    }
}
