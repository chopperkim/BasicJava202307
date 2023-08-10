package chapter13;

public class GenericExample {
    public static void main(String[] args) {
        Product<TV, String> product1 = new Product();
        product1.setKind(new TV());
        product1.setModel("스마트 TV");


        Product<Car, String> product2 = new Product();
        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

    }
}
