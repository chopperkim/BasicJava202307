package chapter16.confirm;

public class Button {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener listener;

    public void setListener(ClickListener listener) {
        this.listener = listener;
    }
    public void click() {
        listener.onClick();
    }
}
