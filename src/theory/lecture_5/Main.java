package theory.lecture_5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by StudentTC on 18.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Runnable teacher2 = new Teacher();
        ((Teacher) teacher2).method();
        String[] names = new String[1];
        teacher2.teach(names);

        List<Integer> list = new LinkedList<>();

        teacher2 = new Driver();
        teacher2.teach(names);


        example(teacher2);


    }

    public static void example(Runnable teacher) {
        String[] names = new String[1];
        teacher.teach();
    }
}

