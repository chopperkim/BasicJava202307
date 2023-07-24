package chapter06.confirm;

public class MemberService {
    boolean login(String id, String password){
        return id.equals("hong") && password.equals("12345");
    }
    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
