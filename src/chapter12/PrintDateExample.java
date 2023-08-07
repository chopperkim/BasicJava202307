package chapter12;

import chapter08.confirm.C;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class PrintDateExample {
    public static void main(String[] args) {
        // 1. Date
//        Date date = new Date();
//        System.out.println(date);
//        // yyyyMMddhhmmssSSS
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");
//        String myDate = dateFormat.format(date);
//        System.out.println(myDate);

        // 2. Calendar

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);// 0 ~ 11
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.printf("%d년 %d월 %d일 (%d) %d시 %d분 %d초\n", year, month + 1, date, day, hour, minute, second);

        // 3. LocalDateTime (jdk 8 이상)
        // 2023-08-07
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // method chaining 방식
        String myDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초"));
        System.out.println(myDate);
        LocalDateTime lastDate = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
    }
}
