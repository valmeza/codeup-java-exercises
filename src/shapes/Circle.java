package shapes;

public class Circle {
    private double radius;
    private double pi = Math.PI;

    public void Circle (double radius) {
        System.out.println("Enter a radius: ");
        this.radius = radius;
        System.out.println("Radius: " + radius);
    }

    public void getArea() {
        System.out.print("Area: ");
        System.out.println(pi * (this.radius * this.radius));
    }

    public void getCircumference() {
        System.out.print("Circumference: ");
        System.out.println(2 * pi * this.radius);
    }
}
