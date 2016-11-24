package theory.lecture_15.creational.abstractFactory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case "Cirlce":
                shape =  new Circle();
                break;
            case "Rectangle":
                shape =  new Rectangle();
                break;
            case "Square":
                shape =  new Square();
                break;
        }
        return shape;
    }
}
