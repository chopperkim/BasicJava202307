package chapter06;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1 == person2);
    }
}
