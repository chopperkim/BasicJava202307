package chapter12.confirm;

public class Confirm1209 {
    public static void main(String[] args) {
        String bye = "안녕";
        byte[] byeBytes = bye.getBytes();

        byte[] bytes = {-20, -107, -120, -21, -123, -107};
        String str = new String(bytes);
        System.out.println(str);
    }
}
