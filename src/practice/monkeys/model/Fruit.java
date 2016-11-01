package practice.monkeys.model;

import practice.monkeys.service.MonkeyService;

import static practice.monkeys.service.MonkeyService.*;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Fruit {
    private final FruitType type;

    public Fruit(String type) {
        this.type = FruitType.valueOf(type);
    }

    public FruitType getType() {
        return type;
    }
}
