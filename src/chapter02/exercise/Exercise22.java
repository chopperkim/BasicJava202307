package chapter02.exercise;

public class Exercise22 {
    public static void main(String[] args) {
        /*
        지구에서 가장 가까운 별은 어디일까? 정답은 태양이다.
        태양 다음으로 가까운 별은 프록시마 센타우리(Proxima Centauri) 별이라고 한다.
        프록시마 센타우리는 지구로 부터 40 * 10^12km 떨어져 있다고 한다.
        빛의 속도로 프록시마 센타우리까지 간다면 시간이 얼마나 걸리는지
        직접 계산해보기로 하자.
        빛의 속도는 300,000km/s이다.
        힌트: 천문학에서 사용하는 숫자들은 아주 크기 때문에 double형을 사용하여야 한다.
        double distance = 40e12;로 나타낼 수 있다.
         */
        // 거리와 속도 정의
        double distance_km = 40e12;  // km
        double speedOfLight = 300000;  // km/s

        // 1광년의 거리 계산
        double distance = speedOfLight * 60 * 60 * 24 * 365;  // km/year

        // 프록시마 센타우리까지의 거리 계산
        distance = distance_km / distance;

        // 결과 출력
        System.out.println("프록시마 센타우리까지의 거리: " + distance + " 광년");
    }
}
