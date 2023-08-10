package chapter14;

public class BBip extends Thread {
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
}
