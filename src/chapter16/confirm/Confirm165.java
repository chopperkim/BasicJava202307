package chapter16.confirm;

public class Confirm165 {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setListener(() -> System.out.println("OK 버튼을 클릭했습니다."));
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
        btnCancel.click();
    }
}
