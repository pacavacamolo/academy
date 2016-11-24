package theory.lecture_15.structural.decorator;

public class ColorShapeDecorator extends ShapeDecorator {

    public ColorShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color: red");
    }
}
