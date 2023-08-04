package chapter11;

public class HandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};
        for (int i = 0; i <= array.length; i++) {
            int value = Integer.parseInt(array[i]);
            System.out.printf("array[%d]: %d\n", i, value);
        }
    }
}
