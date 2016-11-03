package practice.monkeys.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Branch {
    List<Branch> branches = new ArrayList<>();
    List<Fruit> fruits = new ArrayList<>();

    public void populateBranch(String type, int number) {
        for (int i = 0; i < number; i++) {
            fruits.add(new Fruit(type));
        }
        this.setFruits(fruits);
    }


    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }
}
