package util;

public class InputTest {
    public static void main(String[] args) {
        Input response = new Input();
        response.getString();
        response.yesNo();
        response.getInt(1, 10);
        response.getInt();
        response.getDouble(1.0, 10.00);
        response.getDouble();
    }
}
