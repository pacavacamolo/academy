package theory.lecture_2.operators;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StudentTC on 11.10.2016.
 */
public class Main {
    static boolean flag;
    Integer xx = 10;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(method());

        for (Integer number : list) {
            if (number == 5) {
                continue;
            }
            System.out.println(number);
        }
    }

    static int method() {
        return 1;
    }
}
