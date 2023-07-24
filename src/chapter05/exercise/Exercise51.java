package chapter05.exercise;

public class Exercise51 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] array = {38, 96, 16, 3, 76, 94, 82, 47, 59, 8};
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
    }
}
