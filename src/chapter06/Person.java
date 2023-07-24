package chapter06;

public class Person {
    // 필드의 선언
    String nation;
    String name;
    int age;
    // default 생성자(Constructor)
    public Person() {
    }

    public Person(String nation) {
        this.nation = nation;
    }

    public Person(String nation, String name) {
        this.nation = nation;
        this.name = name;
    }

    public Person(String nation, String name, int age) {
        this.nation = nation;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
