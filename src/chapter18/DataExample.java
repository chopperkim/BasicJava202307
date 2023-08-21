package chapter18;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataExample {
    public static void main(String[] args) throws Exception {
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("primitive.db"));
        outputStream.writeUTF("홍길동");
        outputStream.writeDouble(95.5);
        outputStream.writeInt(100);

        outputStream.writeUTF("감자바");
        outputStream.writeDouble(90.3);
        outputStream.writeInt(200);

        outputStream.flush();
        outputStream.close();
    }
}
