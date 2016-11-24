package theory.lecture_15.creational.builder;

public abstract class ColdDrink implements Item {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
