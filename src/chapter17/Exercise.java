package chapter17;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        String name = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완," +
                "최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
        // 1. 김씨와 이씨는 각각 몇 명 인가요?
        String[] names = name.split(",");
        long leeCount = Arrays.stream(names).filter(s -> s.startsWith("이")).count();
        long kimCount = Arrays.stream(names).filter(s -> s.startsWith("김")).count();
        System.out.println("이씨는 " + leeCount + "명");
        System.out.println("김씨는 " + kimCount + "명");

        // 2. 이재영이라는 이름은 몇번 반복되나요?
        long count = Arrays.stream(names).filter(s -> s.equals("이재영")).count();
        System.out.println("이재영은 " + count + "번 반복됩니다.");
        // 3. 중복을 제거한 이름을 출력하세요.
        Arrays.stream(names).distinct().forEach(System.out::println);

        System.out.println();
        // 4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
        Arrays.stream(names).distinct().sorted().forEach(System.out::println);
    }
}
