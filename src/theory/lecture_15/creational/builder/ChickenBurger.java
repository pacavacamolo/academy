package theory.lecture_15.creational.builder;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "ChickenBurger";
    }

    @Override
    public float getPrice() {
        return 5.0f;
    }
}
