package theory.lecture_15.structural.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle: draw");
    }
}
