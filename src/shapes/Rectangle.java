package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static int getArea(int length, int width) {
        return 2 * (length) + 2 * (width);
    }

    public static int perimeter(int length, int width) {
        return length * width;
    }
}
