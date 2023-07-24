package chapter05.confirm;

public class Confirm57 {
    public static void main(String[] args) {
        // 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요.
        int[] array = {1, 5, 3, 8, 2};
        // 최대값을 저장하는 변수
        int max = 0;
        for (int arr : array) {
            if (max < arr) {
                max = arr;
            }
        }
        System.out.println(max);
    }
}
