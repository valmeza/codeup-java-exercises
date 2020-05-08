package shapes;

public class Circle {
    //properties
    private double radius;
    static private int count = 0; // Bonus: Created property set it to static private so no one changes the value
    private double pi = Math.PI;

    // constructors
    
    // There's no circle without a radius
    public Circle (double radius) {
        this.radius = radius;
        count++; // Bonus count every new circle
    }

    public static int getCount() {
        return count;
    }

    public double getArea() {
        return pi * (Math.pow(this.radius, 2));
    }

    public double getCircumference() {
        return 2 * pi * this.radius;
    }
}
