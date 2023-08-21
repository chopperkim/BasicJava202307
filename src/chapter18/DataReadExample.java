package chapter18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataReadExample {
    public static void main(String[] args) throws Exception {
        DataInputStream inputStream = new DataInputStream(new FileInputStream("primitive.db"));
        for (int i = 0; i < 2; i++) {
            String name = inputStream.readUTF();
            double score = inputStream.readDouble();
            int order = inputStream.readInt();
            System.out.printf("%s : %f : %d\n", name, score, order);
        }
        inputStream.close();

    }
}

