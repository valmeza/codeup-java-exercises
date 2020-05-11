package shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side); // grabs the parents constructor.
    }


    // override method

    public int getArea() {
        return (int) Math.pow(super.width, 2); // width to the second power
    }

    public int getPerimeter() {
        return 4 * super.length;
    }
}
