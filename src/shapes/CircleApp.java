package shapes;
import util.Input;

public class CircleApp {
    public static void main (String[] args) {
        Input input = new Input(); // this will import our Input Class
//        Circle circle = new Circle(input.getDouble()); // calls the Circle Class
        Circle circle;
        // Bonus: Use yesNo
        while(input.yesNo()) {
            circle = new Circle(input.getDouble());
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
        }
        System.out.println("Count: " + Circle.getCount());
    }
}
