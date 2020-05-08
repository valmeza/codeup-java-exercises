package shapes;

public class Circle {
    private double radius;
    private double pi = Math.PI;

    // There's no circle without a radius
    public Circle (double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * (Math.pow(this.radius, 2));
    }

    public double getCircumference() {
        return 2 * pi * this.radius;
    }
}
