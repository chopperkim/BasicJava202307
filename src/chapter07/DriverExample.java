package chapter07;

import chapter06.package1.B;

public class DriverExample {
    public static void main(String[] args) {
//        Driver driver = new Driver();
//        Vehicle vehicle = new Bus();
//        driver.drive(vehicle);
//        driver.drive(new Taxi());
//        Vehicle v = new Bus();
//        Bus bus = (Bus) v;
//        bus.checkFee();
//
//        ((Bus) v).checkFee();




        method(new Bus());
    }

    private static void method(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) {
            bus.checkFee();
        } else {
            System.out.println("캐스팅 할 수 없습니다.");
        }
    }
}
