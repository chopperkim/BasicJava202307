package chapter02;

public class VariableUseExample {
    public static void main(String[] args) {
        // 시간, 분을 입력 받고 "5시간 35분"
        int hour = 11; // 선언과 동시에 초기화
        int minute = 7;
        System.out.println(hour + "시간 " + minute + "분");
        System.out.printf("%02d시간 %02d분\n", hour, minute);
        int totalMinute = hour * 60 + minute;
        System.out.println("총 " + totalMinute + "분");
        System.out.printf("총 %d분", totalMinute);
    }
}
