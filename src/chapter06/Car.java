package chapter06;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car() {
        this(null, null, 0);
    }
    public Car(String model) {
        this(model, null, 0);
    }
    public Car(String model, String color) {
        this(model, color, 0);
    }
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("Car 클래스 생성되었습니다.");
    }
    void run() {

    }
}
