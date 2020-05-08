package shapes;
import util.Input;

public class CircleApp {
    public static void main (String[] args) {
        Circle radius = new Circle();
        Input input = new Input();
        double response = input.getDouble();
        radius.Circle(response);
        radius.getArea();
        radius.getCircumference();
    }
}
