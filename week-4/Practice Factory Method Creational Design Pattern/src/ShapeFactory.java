import shape.*;

public class ShapeFactory {
    public Shape getShape(String name) {
        if("circle".equals(name))
            return new Circle();
        else if("square".equals(name))
            return new Square();
        else
            return new Rectangle();
    }
}
