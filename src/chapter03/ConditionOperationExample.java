package chapter03;

public class ConditionOperationExample {
    public static void main(String[] args) {
        int score = 75;
        char grade = score > 90 ? 'A': (score > 80 ? 'B':'C');
        System.out.println(grade);
    }
}
