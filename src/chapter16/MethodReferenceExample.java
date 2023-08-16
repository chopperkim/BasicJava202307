package chapter16;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        // (s, str) -> s.compareToIgnoreCase(str)
        person.ordering(String::compareToIgnoreCase);
//        person.ordering(String::compareToIgnoreCase);
    }
}
