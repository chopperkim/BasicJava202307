package chapter08.exercise;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return String.format("도형의 종류: 사각형, 둘레: %.2f㎝, 넓이: %.2f㎠", perimeter(), area());
    }
}
