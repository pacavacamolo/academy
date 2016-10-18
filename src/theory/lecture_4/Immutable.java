package theory.lecture_4;

/**
 * Created by StudentTC on 18.10.2016.
 */
public class Immutable {
    private Teacher teacher;

    public Immutable(Teacher teacher) {
        this.teacher = new Teacher(teacher);

    }

    public Teacher getTeacher() {
        return new Teacher(teacher);
    }


}
