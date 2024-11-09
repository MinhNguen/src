import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * hisdowd.
     */

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;

    }

    /**
     * dewke.
     */

    public double getPointX() {
        return pointX;
    }

    /**
     * dwquiyrq.
     */

    public double getPointY() {
        return pointY;
    }

    /**
     * dkwq.
     */

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * wqiydq.
     */

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * wqeEK.
     */

    public double distance(Point newPoint) {
        return Math.sqrt(
                Math.pow(newPoint.pointX - pointX, 2)
                + Math.pow(newPoint.pointY - pointY, 2)
        );
    }

    /**
     * iukiwquo.
     */

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Point) {
            Point newObj = (Point) o;
            return Math.abs(pointX - newObj.getPointX()) <= 0.001
                    && Math.abs(pointY - newObj.getPointY()) <= 0.001;
        }
        return false;
    }

    /**
     * weqil.
     */

    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * weasdw.
     */

    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }

}
