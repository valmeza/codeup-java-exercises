package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
    public double getArea() {
        return this.length * this.width;
    }
}