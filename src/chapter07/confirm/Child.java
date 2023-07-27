package chapter07.confirm;

public class Child extends Parent {
    public String name;

    public Child() {
        this("홍길동");
    }

    public Child(String name) {
        super();
        this.name = name;
    }
}
