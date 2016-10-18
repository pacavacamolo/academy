package theory.lecture_4;

import java.util.Comparator;

/**
 * Created by StudentTC on 18.10.2016.
 */
public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {

        return o1.getExperience() - o2.getExperience();
    }
}
