package chapter06;

public class Earth {
    Earth() {
        System.out.println("생성자 호출완료");
    }
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
        System.out.println("안녕");
    }

}
