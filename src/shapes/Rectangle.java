package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    public double shape() {
        return 0;
    }
}
