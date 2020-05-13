package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    public double shape() {
        return 0;
    }
}
