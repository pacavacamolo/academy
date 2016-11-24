package theory.lecture_15.structural.facade;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawAllShapes() {
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
