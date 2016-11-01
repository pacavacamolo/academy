package practice.monkeys.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class SmartMonkey extends AbstractMonkey {

    private final List<String> TYPES = Arrays.asList("COCOS", "BANANA");

    @Override
    protected boolean isCalculatable(Fruit fruit) {
        return TYPES.contains(fruit.getType().name());
    }
}
