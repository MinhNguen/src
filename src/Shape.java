public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}

    /**
     * dwroi.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * weewd.
     */

    public String getColor() {
        return color;
    }

    /**
     * wwqde.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * dwqe.
     */

    public boolean isFilled() {
        return filled;
    }

    /**
     * wqde.
     */

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     *wqde.
     */

    public abstract double getArea();

    public abstract double getPerimeter();

    /**
     * ewweq.
     */

    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
