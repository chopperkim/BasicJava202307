package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) throws IOException {
//        FileInputStream inputStream = new FileInputStream("test.db");
//        String result = "";
//        byte[] bytes = new byte[1024];
//        int data = 0;
//        while ((data = inputStream.read(bytes)) != -1) {
//            result += new String(bytes, 0, data);
//        }
//        System.out.println(result);
        FileReader reader = new FileReader("test.db");
        char[] buffer = new char[10];
        String result = new String();
        int data = 0;
        while ((data = reader.read(buffer)) != -1) {
            result += new String(buffer, 0, data);
        }
        System.out.println(result);

    }
}
