package chapter08.exercise;

public class ScienceFiction extends Book {
    public ScienceFiction(String title, String author) {
        super(title, author);
    }

    @Override
    public int getLateFee(int lateDays) {
        return lateDays * 600;
    }
}
