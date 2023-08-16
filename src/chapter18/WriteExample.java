package chapter18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("test.db");
        outputStream.write("안녕하세요.\n고급자바를 수업중입니다.\n이제 곧 가을이 다가옵니다.".getBytes());
        outputStream.flush(); // 실제 파일에 데이터 저장
        outputStream.close(); // 자원 사용후 종료
    }
}
