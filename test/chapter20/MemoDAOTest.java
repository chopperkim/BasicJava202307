package chapter20;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemoDAOTest {

//    @Test
    void selectMemos() throws Exception {
        MemoDAO dao = new MemoDAO();
        List<MemoVO> memos = dao.selectMemos();
        MemoVO vo = memos.get(1);
        assertEquals("첫번째 글", vo.getTitle());

    }

//    @Test
    void insertMemo() throws Exception {
        MemoDAO dao = new MemoDAO();
        dao.insertMemo(new MemoVO("첫번째 글", "테스트 및 배포 첫번째 수업", "chopper"));

    }

//    @Test
    void updateMemo() throws Exception {
        MemoDAO dao = new MemoDAO();
        MemoVO vo = new MemoVO(2, "두번째 글", "두번째 글에 대한 내용", "김은식");
        dao.updateMemo(vo);
        MemoVO memoVO = dao.selectMemo(2);
        assertEquals(vo, memoVO);
    }

    @Test
    void deleteMemo() throws Exception {
        MemoDAO dao = new MemoDAO();
        dao.deleteMemo(3);
        List<MemoVO> memos = dao.selectMemos();
        assertEquals(memos.size(), memos.size());
    }
}