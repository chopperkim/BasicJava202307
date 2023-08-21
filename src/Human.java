public class Human  implements  Flyable{


    @Override
    public int fly(int height) {
        System.out.println("나는 지금" + height +"을 날고있다.");
        return height;
    }
}
