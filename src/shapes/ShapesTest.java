package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Square(5);
        System.out.println("Square Area: " + myShape.getArea());
        System.out.println("Square Perimeter: " + myShape.getPerimeter());


        myShape = new Rectangle(2,3);
        System.out.println("Rectangle Area: " + myShape.getArea());
        System.out.println("Rectangle Perimeter: " + myShape.getPerimeter());

    }
}
