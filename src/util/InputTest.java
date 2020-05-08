package util;

public class InputTest {
    public static void main(String[] args) {
        Input response = new Input();
        response.getString();
        response.yesNo();
        response.getInt(1, 10);
    }
}
