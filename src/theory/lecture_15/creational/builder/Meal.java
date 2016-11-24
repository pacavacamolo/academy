package theory.lecture_15.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    private Meal() {

    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for( Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.getName());
            System.out.println("getPacking:  " + item.getPacking());
            System.out.println("Item: " + item.getName());
        }
    }

    public static MealBuilder builder() {
        return new MealBuilder();
    }

    private static class MealBuilder {

        public Meal prepareVegMeal() {
            Meal meal = new Meal();
            meal.addItem(new VegBurger());
            meal.addItem(new Coke());
            return meal;
        }

        public Meal prepareNonVegMeal() {
            Meal meal = new Meal();
            meal.addItem(new ChickenBurger());
            meal.addItem(new Pepsi());
            return meal;
        }
    }
}
