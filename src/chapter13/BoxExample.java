package chapter13;

import java.util.ArrayList;
import java.util.Map;

public class BoxExample {
    public static void main(String[] args) {

//        Box box = new Box("홍길동");
//        String value = (String) box.getValue();
//
//        Box box1 = new Box(100);
//        Integer value1 = (Integer) box1.getValue();

        Box<String> box = new Box("홍길동");
        String value = box.getValue();


        Box<Integer> box1 = new Box(100);
        Integer value1 = box1.getValue();

    }
}
