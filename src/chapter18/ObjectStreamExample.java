package chapter18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExample {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("object.dat"));
        Member member = new Member("fall", "단풍이");
        Product product = new Product("노트북", 1_500_000);
        int[] array = {1, 2, 3};
        outputStream.writeObject(member);
        outputStream.writeObject(product);
        outputStream.writeObject(array);

        outputStream.close();


    }
}
