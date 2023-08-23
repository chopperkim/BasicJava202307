package chapter20;

import java.sql.Date;
import java.util.Objects;

public class MemoVO {
    private int no;
    private String title;
    private String content;
    private String writer;
    private Date registerDate;
    private Date modifyDate;

    public MemoVO() {
    }

    public MemoVO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public MemoVO(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public MemoVO(int no, String title, String content, String writer) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public MemoVO(int no, String title, String content, String writer, Date registerDate, Date modifyDate) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.registerDate = registerDate;
        this.modifyDate = modifyDate;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemoVO vo = (MemoVO) o;
        return no == vo.no && Objects.equals(title, vo.title) && Objects.equals(content, vo.content) && Objects.equals(writer, vo.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, title, content, writer);
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%s\t%s\t%s", no, title, content, writer, registerDate);
    }
}
