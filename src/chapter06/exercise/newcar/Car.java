package chapter06.exercise.newcar;

public class Car {
    private double speed;
    private String color;
    private static final double MAX_SPEED = kiloToMile(200);

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return mileToKilo(speed);
    }

    public void setSpeed(double speed) {
        this.speed = kiloToMile(speed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean speedUp(double speed) {
        speed = kiloToMile(speed);
        if (speed > 0 && speed < MAX_SPEED) {
            this.speed += speed;
            return true;
        }
        return false;
    }

    public static double getMaxSpeed() {
        return mileToKilo(MAX_SPEED);
    }

    private static double kiloToMile(double distance) {
        return distance / 1.6;
    }

    private static double mileToKilo(double distance) {
        return distance * 1.6;
    }

    // 객체(인스턴스)가 가지고 있는 필드의 데이터를 확인하기 위한 용도
    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }}
