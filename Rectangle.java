import java.awt.Point;
import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;


    public Rectangle() {
    }

    /**
     * kediew.
     */

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * dwefi.
     */

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;

    }

    /**
     * dkwufiewa.
     */

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;

    }

    /**
     * uwuiwef.
     */

    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * wkef.
     */

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * wieodw.
     */

    public double getWidth() {
        return width;
    }

    /**
     * wdwefo.
     */

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * edwief.
     */

    public double getLength() {
        return length;
    }

    /**
     * wiqr.
     */

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * ksid.
     */

    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * jsdwaiud.
     */

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    /**
     * jsdawdoiQ.
     */

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        double saiso = 0.001;
        Rectangle rectangle = (Rectangle) o;
        if (topLeft.equals(rectangle.topLeft)
                && Math.abs(this.width - rectangle.width) <= saiso
                && Math.abs(this.length - rectangle.length) <= saiso) {
            return true;
        }
        return false;
    }

    /**
     * dfhesuf.
     */

    @Override
    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    /**
     * weiewaf.
     */

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ",width=" + String.format("%.1f", width)
                + ",length=" + String.format("%.1f", length)
                + ",color=" + color + ",filled=" + filled + "]";

    }

    public static void main(String[] args) {
        Point topLeft = new Point(1, 1);
        Rectangle rect1 = new Rectangle(topLeft, 5.0, 10.0, "RED", true);

        System.out.println(rect1.toString());
    }
}

