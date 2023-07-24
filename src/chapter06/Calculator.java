package chapter06;

public class Calculator {
    Calculator() {}
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y) {
        Car car = new Car();
        car.run();
        powerOff();
        return x + y;
    }

    double divide(int x, int y) {
        return (double) x / y;
    }
}
