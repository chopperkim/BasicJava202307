package chapter08.exercise;

public class Triangle extends Shape {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.sqrt(3) / 4 * side * side;
    }

    @Override
    public double perimeter() {
        return side * 3;
    }

    @Override
    public String toString() {
        return String.format("도형의 종류: 삼각형, 둘레: %.2f㎝, 넓이: %.2f㎠", perimeter(), area());
    }
}
