package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) { // constructor
//        System.out.println("Area: " + getArea(length, width));
//        System.out.println("Perimeter: " + perimeter(length, width));
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
//    public int getLength() {
//        return this.length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return this.width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public static int getArea(int length, int width) {
//        return 2 * (length) + 2 * (width);
//    }
//
//    public static int perimeter(int length, int width) {
//        return length * width;
//    }

}
