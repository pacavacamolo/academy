package theory.lecture_10.io.ex_7_formatting;

/**
 * Created by Антон on 06.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.format("The square root of %d is %f%n", i, r);
    }
}
