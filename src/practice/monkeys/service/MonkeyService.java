package practice.monkeys.service;

import practice.monkeys.model.BananaMonkey;
import practice.monkeys.model.Branch;
import practice.monkeys.model.Calculation;
import practice.monkeys.model.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class MonkeyService {
    public static void main(String[] args) {
        Branch tree = createTree(FruitType.COCOS.name());

        Calculation monkey = new BananaMonkey();

        calculate(monkey, tree);

        System.out.println(monkey.getNumberOfFruits());
    }

    public static int calculate(Calculation monkey, Branch tree) {
        return monkey.calculate(tree);
    }

    public static Branch createTree(String type) {
        Branch tree = new Branch();
        List<Branch> children = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Branch child = createTree(new Branch(), type);
            children.add(child);
        }

        tree.setBranches(children);

        return tree;
    }

    public static Branch createTree(Branch tree, String type) {
        List<Branch> children = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Branch child = new Branch();
            children.add(child);
        }

        tree.setBranches(children);

        List<Fruit> fruits = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            fruits.add(new Fruit(type));
        }

        tree.setFruits(fruits);

        return tree;
    }

    public enum FruitType {
        COCOS,
        BANANA
    }

}
