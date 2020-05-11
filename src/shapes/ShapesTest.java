package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // rectangle
        Rectangle box1 = new Rectangle(4,5);

        System.out.println("Area: " + box1.getArea()); // had same approach but did sout in the Rectangle file
        System.out.println("Perimeter: " + box1.getPerimeter());

        // a square is morphing into a rectangle
        Square box2 = new Square(5);

        System.out.println("Square Area: " + box2.getArea());
        System.out.println("Square Perimeter: " + box2.getPerimeter());
    }
}
