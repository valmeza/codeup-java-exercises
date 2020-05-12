package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }


    // getter
    public double getLength() {return this.length;}

    public double getWidth() {return this.width;}

    // setter
    public abstract double setLength();

    public abstract double setWidth();
}
