package chapter11.confirm;

public class NotExistIDException extends Exception {
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }
}
