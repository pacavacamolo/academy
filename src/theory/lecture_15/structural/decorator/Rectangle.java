package theory.lecture_15.structural.decorator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle: draw");
    }
}
