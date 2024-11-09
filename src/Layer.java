import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


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
}
