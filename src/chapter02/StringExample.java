package chapter02;

public class StringExample {
    public static void main(String[] args) {
        int a = 100;
        String b = "b";
        String name = "홍길동";
        String job = "프로그래머\\";
        /*
        \"
        \'
        \t: tab
        \n: new line(line feed)
        \r: carriage return
        \\
         */
        String str = "나는 \"자바\"를 배웁니다.\n\r";
        String str2 = "나는 \"자바\"를 배웁니다.\n\r";
        System.out.println(str);
        System.out.println(str2);

        String multiStr = """
                여러 라인을 
                문자열로 표현
                가능합니다.
                """;
    }
}
