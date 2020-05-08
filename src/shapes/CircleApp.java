package shapes;
import util.Input;

public class CircleApp {
    public static void main (String[] args) {
        Circle radius = new Circle();
        Input input = new Input();
        radius.Circle(2);
        radius.getArea();
        radius.getCircumference();
    }
}
