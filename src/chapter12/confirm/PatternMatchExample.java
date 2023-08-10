package chapter12.confirm;

import java.util.regex.Pattern;

public class PatternMatchExample {
    public static void main(String[] args) {
        String id = "z5Angel1004";
        String regExp = "^[a-zA-Z][a-zA-Z0-9]{7,11}";
//        boolean isMatch = Pattern.matches(regExp, id);
        boolean isMatch = id.matches(regExp);
        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다");
        } else {
            System.out.println("ID로 사용할 수 없습니다");
        }

    }
}
