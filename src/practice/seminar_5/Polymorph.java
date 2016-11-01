package practice.seminar_5;

/**
 * Created by StudentTC on 20.10.2016.
 */
public class Polymorph {
    public static void main(String[] args) {
        int x = 12;
        Man man1 = new Teacher();
        Man man2 = new Driver();

        Polymorph polymorph = new Polymorph();
//        System.out.println(polymorph.legacyMethod(true));
//        System.out.println(polymorph.legacyMethod(false));
        System.out.println(polymorph.polymorphMethod(man1));
        System.out.println(polymorph.polymorphMethod(man2));
    }

    public int legacyMethod(boolean parameter) {
        int result;
        if (parameter) {
            result = 100;
        }
        else
        {
            result = 200;
        }
        return result;
    }

    public int polymorphMethod(Man man) {
        return man.getExperience();
    }


}
