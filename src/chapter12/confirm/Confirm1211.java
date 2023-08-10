package chapter12.confirm;

import java.util.StringTokenizer;

public class Confirm1211 {
    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
//        StringTokenizer tokenizer = new StringTokenizer(str, ",");
//        while (tokenizer.hasMoreTokens()) {
//            System.out.println(tokenizer.nextToken());
//        }
    }
}
