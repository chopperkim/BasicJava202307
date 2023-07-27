package chapter07;

public class LiskovExample {
    public static void main(String[] args) {
        Parent child = new Child();
        child.method2();
        System.out.println(child.balance);
    }
}
