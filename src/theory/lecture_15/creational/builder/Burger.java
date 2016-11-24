package theory.lecture_15.creational.builder;

public abstract class Burger implements Item {
    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
