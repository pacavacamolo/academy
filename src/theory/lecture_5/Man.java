package theory.lecture_5;

import java.util.Objects;

/**
 * Created by StudentTC on 18.10.2016.
 */
public abstract class Man implements Cloneable, Runnable{
    protected int experience = 7;
    public int x = 10;
    public int y = 30;

    public void teach(String... names) {
        System.out.printf("111");
    }

    public abstract void methodAbstract();

    public void method() {

    }

    static {
        System.out.println("статич блок предка");
    }

    {
        System.out.println("блок предка");
    }

    public Man() {
        System.out.println("конструктор предка");
    }



    public Man getMan() {
        return null;
    }

    public abstract int getExperience();

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Man man = (Man) o;
//        return experience == man.experience &&
//                x == man.x &&
//                y == man.y;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(experience, x, y);
//    }
}
