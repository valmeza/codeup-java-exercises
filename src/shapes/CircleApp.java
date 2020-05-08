package shapes;
import util.Input;

public class CircleApp {
    public static void main (String[] args) {
        Input input = new Input(); // this will import our Input Class
        Circle circle = new Circle(input.getDouble());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Circumference: " + circle.getCircumference());
    }
}
