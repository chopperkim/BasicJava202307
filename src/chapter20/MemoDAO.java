package chapter20;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemoDAO {
    public List<MemoVO> selectMemos() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.37:1521:xe", "java", "oracle21c");
        Statement statement = connection.createStatement();
        StringBuilder builder = new StringBuilder();
        builder.append("select ");
        builder.append("   no, ");
        builder.append("   title, ");
        builder.append("   content, ");
        builder.append("   writer, ");
        builder.append("   register_date, ");
        builder.append("   modify_date ");
        builder.append("from ");
        builder.append("    MEMO ");
        builder.append("order by no ");
        String sql = builder.toString();
        ResultSet resultSet = statement.executeQuery(sql);
        List<MemoVO> memos = new ArrayList<>();
        while (resultSet.next()) {
            int no = resultSet.getInt("no");
            String title = resultSet.getString("title");
            String content = resultSet.getString("content");
            String writer = resultSet.getString("writer");
            Date registerDate = resultSet.getDate("register_date");
            Date modifyDate = resultSet.getDate("modify_date");
            memos.add(new MemoVO(no, title, content, writer, registerDate, modifyDate));
        }
        resultSet.close();
        statement.close();
        connection.close();
        return memos;
    }
    public MemoVO selectMemo(int selectNo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.37:1521:xe", "java", "oracle21c");

        StringBuilder builder = new StringBuilder();
        builder.append("select ");
        builder.append("   no, ");
        builder.append("   title, ");
        builder.append("   content, ");
        builder.append("   writer, ");
        builder.append("   register_date, ");
        builder.append("   modify_date ");
        builder.append("from ");
        builder.append("    MEMO ");
        builder.append("where ");
        builder.append("    NO = ?");
        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, selectNo);
        ResultSet resultSet = statement.executeQuery();
        MemoVO memo = null;
        if (resultSet.next()) {
            int no = resultSet.getInt("no");
            String title = resultSet.getString("title");
            String content = resultSet.getString("content");
            String writer = resultSet.getString("writer");
            Date registerDate = resultSet.getDate("register_date");
            Date modifyDate = resultSet.getDate("modify_date");
            memo = new MemoVO(no, title, content, writer, registerDate, modifyDate);
        }
        resultSet.close();
        statement.close();
        connection.close();
        return memo;
    }

    public int insertMemo(MemoVO vo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.37:1521:xe", "java", "oracle21c");
        StringBuilder builder = new StringBuilder();
        builder.append("insert into ");
        builder.append("    MEMO ");
        builder.append("    ( ");
        builder.append("        TITLE, ");
        builder.append("        CONTENT, ");
        builder.append("        WRITER ");
        builder.append("    ) ");
        builder.append("values ");
        builder.append("    ( ");
        builder.append("        ?, ");
        builder.append("        ?, ");
        builder.append("        ? ");
        builder.append("    ) ");
        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, vo.getTitle());
        statement.setString(2, vo.getContent());
        statement.setString(3, vo.getWriter());
        // select => executeQuery()를 호출
        // insert, update, delete => executeUpdate()를 호출
        // 리턴값은 실행 결과 몇개의 행이 성공했는지 알려준다.
        int executedInsert = statement.executeUpdate();

        statement.close();
        connection.close();
        return executedInsert;
    }
    public int updateMemo(MemoVO vo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.37:1521:xe", "java", "oracle21c");
        StringBuilder builder = new StringBuilder();
        builder.append("update MEMO ");
        builder.append("set title   = ?, ");
        builder.append("    content = ?, ");
        builder.append("    writer  = ?, ");
        builder.append("    modify_date  = sysdate ");
        builder.append("where no = ?");
        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, vo.getTitle());
        statement.setString(2, vo.getContent());
        statement.setString(3, vo.getWriter());
        statement.setInt(4, vo.getNo());
        // select => executeQuery()를 호출
        // insert, update, delete => executeUpdate()를 호출
        // 리턴값은 실행 결과 몇개의 행이 성공했는지 알려준다.
        int executedUpdate = statement.executeUpdate();
        statement.close();
        connection.close();
        return executedUpdate;
    }
    public int deleteMemo(int deleteNo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.37:1521:xe", "java", "oracle21c");
        StringBuilder builder = new StringBuilder();
        builder.append("delete ");
        builder.append("from memo ");
        builder.append("where no = ? ");
        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, deleteNo);
        int executedDelete = statement.executeUpdate();
        statement.close();
        connection.close();
        return executedDelete;
    }

}
