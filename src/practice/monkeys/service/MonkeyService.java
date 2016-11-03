package practice.monkeys.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import practice.monkeys.model.Branch;
import practice.monkeys.model.Calculation;
import practice.monkeys.model.CocosMonkey;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class MonkeyService {
    private static Random random = new Random();

    public static void main(String[] args) {
        Branch tree = createTree(FruitType.COCOS.name());

        Calculation monkey = new CocosMonkey();

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

        for (int i = 0; i < random.nextInt(9); i++) {
            Branch child = new Branch();
            child.populateBranch(FruitType.COCOS.name(), 1);
            children.add(child);
        }
        tree.setBranches(children);
        tree.populateBranch(FruitType.COCOS.name(), 0);

        return tree;
    }

    public enum FruitType {
        COCOS,
        BANANA
    }
}
