package chapter06;

import java.util.Arrays;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.powerOn();
        int answer = calculator.plus(10, 20);
        System.out.println("합계: " + answer);

        int x = 10;
        int y = 4;
        double result = calculator.divide(x, y);
        System.out.println("나눗셈 결과: " + result);

        calculator.powerOff();

        System.out.println();
    }
}
