package chapter12.confirm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Confirm1216 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
        String formatted = dateFormat.format(date);
        System.out.println(formatted);
    }
}
