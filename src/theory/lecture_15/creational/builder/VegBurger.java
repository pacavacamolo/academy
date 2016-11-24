package theory.lecture_15.creational.builder;

public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "VegBurger";
    }

    @Override
    public float getPrice() {
        return 6.0f;
    }
}
