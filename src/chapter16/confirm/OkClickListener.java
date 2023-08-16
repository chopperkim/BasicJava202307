package chapter16.confirm;

public class OkClickListener implements Button.ClickListener {
    @Override
    public void onClick() {
        System.out.println("OK 버튼을 클릭했습니다.");
    }
}
