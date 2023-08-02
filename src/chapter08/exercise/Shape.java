package chapter08.exercise;

import org.jetbrains.annotations.NotNull;

public abstract class Shape implements Comparable<Shape> {
    public Shape() {
    }
    public abstract double area();
    public abstract double perimeter();

    @Override
    public int compareTo(@NotNull Shape o) {
        if (area() > o.area()) {
            return 1;
        } else if (area() < o.area()) {
            return -1;
        } else {
            return 0;
        }
    }
}
