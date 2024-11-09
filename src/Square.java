import java.util.Objects;

public class Square extends Rectangle {
    public Square() {}

    /**
     * qqw.
     */

    public Square(double side) {
        super(side, side);
    }

    /**
     * wdowq.
     */

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * wdwqf.
     */

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);

    }

    /**
     * wqeiw.
     */

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    /**
     * qWSqae.
     */

    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square tmp = (Square) o;
            return Math.abs(tmp.getSide() - this.getSide()) <= 0.001
                    && Objects.equals(this.getTopLeft(), tmp.getTopLeft());
        }
        return false;
    }

    /**
     * weiew.
     */

    @Override
    public int hashCode() {
        return Objects.hash(getSide(), topLeft);
    }

    /**
     * dhiwef.
     */

    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                getTopLeft(), getSide(), color, filled);
    }
}
