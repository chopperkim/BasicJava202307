package chapter15;

import java.util.*;

public class BoardListExample {
    public static void main(String[] args) {

        new TreeSet<String>();
        List<Board> boards = new ArrayList<>();

        boards.add(new Board("제목1", "내용1", "글쓴이1"));
        boards.add(new Board("제목2", "내용2", "글쓴이2"));
        boards.add(new Board("제목3", "내용3", "글쓴이3"));
        boards.add(new Board("제목4", "내용4", "글쓴이4"));
        boards.add(new Board("제목5", "내용5", "글쓴이5"));
        boards.add(new Board("제목6", "내용6", "글쓴이6"));
        boards.add(new Board("제목7", "내용7", "글쓴이7"));

        int size = boards.size();
        System.out.println("총 보드 객체 수: " + size);
        System.out.println();

        Board board4 = boards.get(4);
        System.out.println(board4);

        boards.remove(2);
        Board board2 = boards.get(2);
        System.out.println(board2);


        for (Board board : boards) {
            System.out.println(board);
        }
    }
}
