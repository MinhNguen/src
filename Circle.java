import java.util.Objects;
import java.util.Iterator;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * iwwidui.
     */

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * owrod.
     */

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;

    }

    /**
     * edowu.
     */

    public Point getCenter() {
        return center;
    }

    /**
     * dwudw.
     */

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * dwd.
     */

    public double getRadius() {
        return radius;
    }

    /**
     * dwd.
     */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * dwef.
     */

    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * edw.
     */

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * wqe.
     */

    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                center.toString(),
                radius, color, filled);
    }

    /**
     * deqe.
     */

    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point tmp = (Point) o;
            return center.getPointX() == tmp.getPointX()
                    && center.getPointY() == tmp.getPointY();
        }
        return false;
    }

    /**
     * wedwd.
     */

    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }

}
