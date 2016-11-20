package practice.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public void doSomething(List<Animal> animals) {

    }

    public <T extends Animal> void doSomethingElse(List<T> animals) {

    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());

        Generics generics = new Generics();
        generics.doSomething(animals);
        generics.doSomethingElse(animals);
    }
}

class Animal {
    public void run() {
        System.out.println("animal run");
    }
}

class Dog extends Animal {

    @Override
    public void run() {
        System.out.println("dog run");
    }

    public void jump() {
        System.out.println("jump");
    }

}
