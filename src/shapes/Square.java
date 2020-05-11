package shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side); // grabs the parents constructor.
    }


    // override method

    public int getArea() {
        System.out.println("Get Area from sq: ");
        return (int) Math.pow(super.width, 2); // width to the second power
    }

    public int getPerimeter() {
        System.out.println("Get Perimeter from sq: ");
        return 4 * super.length;
    }
}
