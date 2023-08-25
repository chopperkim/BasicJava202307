package chapter20;

import java.util.List;

public class MemoService {
    private MemoDAO dao = MemoDAO.getInstance();

    private static MemoService instance = new MemoService();
    private MemoService() {
    }
    public static MemoService getInstance() {
        return instance;
    }

    public List<MemoVO> selectMemos() throws Exception {
        return dao.selectMemos();
    }
    public MemoVO selectMemo(int selectNo) throws Exception {
        return dao.selectMemo(selectNo);
    }
    public int insertMemo(MemoVO vo) throws Exception {
        return dao.insertMemo(vo);
    }
    public int updateMemo(MemoVO vo) throws Exception {
        return dao.updateMemo(vo);
    }
    public int deleteMemo(int deleteNo) throws Exception {
        return dao.deleteMemo(deleteNo);
    }

}
