package theory.lecture_15.structural.decorator;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square: draw");
    }
}
