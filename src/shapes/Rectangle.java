package shapes;

public abstract class Rectangle extends Quadrilateral{
    protected int length;
    protected int width;

    public Rectangle(double length, double width) {
        super(length, width);
    }
    public double setLength() {
        return this.length;
    }

    public double setWidth() {
        return this.width;
    }
}
