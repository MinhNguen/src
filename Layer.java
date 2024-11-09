import java.awt.Rectangle;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Layer {
    private List<Shape> shapes;

    public Layer() {
        this.shapes = new ArrayList<>();
    }


    /**
     * wriet.
     */

    public void addShape(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }
    }

    /**
     * qwhwq.
     */

    public void removeCircles() {
        if (shapes == null) {
            return;
        }
        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext() == true) {
             Shape shape = iterator.next();
             if (shape instanceof Circle) {
                 iterator.remove();
             }

        }
    }

    /**
     * wuoiqw.
     */

    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            info.append(shape).append("\n");
        }
        return info.toString();
    }

    /**
     * wefrew.
     */

    public void removeDuplicates() {
        Set<Shape> newShapes = new HashSet<>();
        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            if (!newShapes.add(shape)) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Layer layer = new Layer();
        Circle c = new Circle(new Point(1, 2), 2, "red", true);
        Circle c1 = new Circle(new Point(1, 2), 2, "red", true);
//        Rectangle r = new Rectangle(new Point(2, 2), 8.0, 6.0, "red", false);
        Square s = new Square(new Point(1, 2), 5, "orange", false);

        layer.addShape(c);
        layer.addShape(c1);
//        layer.addShape(r);
        layer.addShape(s);

        System.out.println(layer.getInfo());
        layer.removeDuplicates();
        System.out.println(layer.getInfo());

    }



}
