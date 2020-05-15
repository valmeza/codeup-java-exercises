package shapes;

public abstract class Shape {
    protected double length;
    protected double width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength();
    public abstract void setWidth();
}
