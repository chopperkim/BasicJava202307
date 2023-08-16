package chapter14;

import lombok.SneakyThrows;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) throws Exception {
        // 1. Thread 객체 사용
//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.println("[ㄷ]");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                    }
//                }
//            }
//        };
//        thread.start();

        // 2. Runnable Interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("[ㄷ]");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("[ㄷ]");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        thread.start();

        BBip bBip = new BBip();
        bBip.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("삡");
            Thread.sleep(1000);
        }
    }
}
