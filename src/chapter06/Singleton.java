package chapter06;

public class Singleton {
    private static Singleton instance = new Singleton();
    static final String NAME;
    static {
        NAME = "asd";
    }
    private Singleton() {
    }
    public static Singleton getInstance() {
        return instance;
    }
}
