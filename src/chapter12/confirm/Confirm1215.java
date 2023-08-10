package chapter12.confirm;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Confirm1215 {
    public static void main(String[] args) {
        long diff = LocalDateTime.now().until(
            LocalDateTime.of(2023, 12, 31, 0, 0, 0),
            ChronoUnit.DAYS
        );
        System.out.println("남은 날짜: " + diff);
    }
}
