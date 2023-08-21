package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object.dat"));
        Member member = (Member) inputStream.readObject();
        Product product = (Product) inputStream.readObject();
        int[] array = (int[]) inputStream.readObject();
        inputStream.close();

        System.out.println(member);
        System.out.println(product);
        System.out.println(Arrays.toString(array));
    }
}
