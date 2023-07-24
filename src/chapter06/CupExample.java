package chapter06;

public class CupExample {
    public static void main(String[] args) {
        Cup cup1 = new Cup();
        cup1.height = 10;
        cup1.radius = 5;
        cup1.color = "blue";

        Cup cup2 = new Cup();
        cup2.height = 15;
        cup2.radius = 3;
        cup2.color = "transparent";

        Cup cup3 = new Cup(7, 4, "white");
        Cup cup4 = new Cup(7, 4, "white");
        Cup cup5 = new Cup(7, 4, "white");
    }
}
