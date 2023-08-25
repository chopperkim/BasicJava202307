package chapter20;

import java.util.List;
import java.util.Scanner;

public class MemoView {
    private static MemoView instance = new MemoView();
    private MemoView() {

    }
    public static MemoView getInstance() {
        return instance;
    }

    public void welcome() {
        System.out.println("나의 메모");
    }

    public int mainMenu(Scanner scanner) {
        System.out.println("------------------------------------------");
        System.out.println("1.목록 | 2.등록 | 3.수정 | 4.삭제 | 0.종료");
        System.out.println("------------------------------------------");
        System.out.print("메뉴 선택> ");
        int menu = 0;
        try {
            menu = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
//            System.out.println("메뉴 입력이 잘못되었습니다.");
            menu = -1;
        }
        return menu;
    }

    public void printMemos(List<MemoVO> memos) {
        System.out.println("전체 목록");
        memos.forEach(System.out::println);
    }

    public MemoVO insertMemo(Scanner scanner) {
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("내용: ");
        String content = scanner.nextLine();
        System.out.print("작성자: ");
        String writer = scanner.nextLine();
        return new MemoVO(title, content, writer);
    }

    public void insertResult(int result) {
        if (result > 0) {
            System.out.println("메모가 등록되었습니다.");
        } else {
            System.out.println("메모가 정상적으로 등록되지 않았습니다.");
        }
    }

    public MemoVO updateMemo(Scanner scanner) {
        System.out.print("수정할 메모 번호: ");
        int no = Integer.parseInt(scanner.nextLine());
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("내용: ");
        String content = scanner.nextLine();
        System.out.print("작성자: ");
        String writer = scanner.nextLine();
        return new MemoVO(no, title, content, writer);
    }
    public void updateResult(int result) {
        if (result > 0) {
            System.out.println("메모가 수정되었습니다.");
        } else {
            System.out.println("메모가 정상적으로 수정되지 않았습니다.");
        }
    }
    public int deleteMemo(Scanner scanner) {
        System.out.print("삭제할 메모 번호: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public void deleteResult(int result) {
        if (result > 0) {
            System.out.println("메모가 삭제되었습니다.");
        } else {
            System.out.println("메모가 정상적으로 삭제되지 않았습니다.");
        }
    }

    public void inputError() {
        System.out.println("메뉴 입력이 잘못되었습니다.");
    }
}
