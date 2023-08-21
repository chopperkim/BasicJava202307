package chapter18;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        // 1. buffer를 안 사용한 것
        FileInputStream fileInputStream1 = new FileInputStream("skyscrapers.mp4");

        FileOutputStream fileOutputStream1 = new FileOutputStream("/home/ssam/바탕화면/sky1.mp4");

        // 2. buffer를 사용한 것
        FileInputStream fileInputStream2 = new FileInputStream("skyscrapers.mp4");
        BufferedInputStream inputStream = new BufferedInputStream(fileInputStream2);

        FileOutputStream fileOutputStream2 = new FileOutputStream("/home/ssam/바탕화면/sky2.mp4");
        BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream2);

        // 1. 버퍼를 사용하지 않고 복사
        System.out.println("버퍼 미사용: " + copy(fileInputStream1, fileOutputStream1) + "ns");

        // 2. 버퍼를 사용하고 복사
        System.out.println("버퍼 사용: " + copy(inputStream, outputStream) + "ns");

        outputStream.close();
        fileOutputStream2.close();
        inputStream.close();
        fileInputStream2.close();

        fileInputStream1.close();
        fileOutputStream1.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("skyscrapers.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/ssam/바탕화면/sky3.mp4"));
        byte[] buffer = new byte[1024];
        int data = -1;
        while ((data = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, data);
        }


    }

    /**
     *
     * @param inputStream
     * @param outputStream
     * @return 얼마나 시간이 걸리는지 걸린 시간(long) 반환
     */
    private static long copy(InputStream inputStream, OutputStream outputStream) throws Exception {
        long startTime = System.nanoTime();
        int data = -1;
        byte[] buffer = new byte[1024];
        while ((data = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, data);
        }
        outputStream.flush();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
