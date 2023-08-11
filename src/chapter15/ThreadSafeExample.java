package chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadSafeExample {
    public static void main(String[] args) {
        List<Board> boards = new Vector<>();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    boards.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    boards.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int size = boards.size();
        System.out.println("총 객체 수: " + size);
    }
}
