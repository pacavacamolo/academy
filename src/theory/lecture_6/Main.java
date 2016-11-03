package theory.lecture_6;

import java.io.Serializable;

/**
 * Created by StudentTC on 25.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass nested = OuterClass.getNested();

        OuterClass clazz = new OuterClass();
//        OuterClass.InnerClass inner = clazz.new InnerClass();

        Season season = Season.SPRING;
        System.out.println(season.getCountOfDays());
        System.out.println(season.name());

        Season[] seasons = Season.values();
        Season result;
        for (Season i : seasons) {
            if (i.getCountOfDays() == 92) {
                result = i;
                break;
            }
        }


        Season season1 = Season.valueOf("AUTUMN");
        Interf interf = new B();
        interf = new B1();
        interf = new C();
        interf.method();
        A a = new A(interf);

    }

    public void method(Serializable value) {

    }
}
