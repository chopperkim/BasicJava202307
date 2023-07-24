package chapter06.example;

public class Person {
    private int age;
    private String name;

    private boolean glasses;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
