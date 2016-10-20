package theory.lecture_5;

/**
 * Created by StudentTC on 18.10.2016.
 */
public class Teacher extends Man implements Comparable {
    private Man man;

    private static final int color;

    static {
        System.out.println("статический блок");
        color = 20;
    }

    {
        System.out.println("логический блок");
    }

    @Override
    public void methodAbstract() {
        System.out.println("123");
    }

    @Override
    public int compareTo(Object o) {

        return ((Teacher) o).getExperience() - this.experience;
    }

    public Teacher(Man man, int experience ) {

        this.experience = experience;
        this.man = man;

    }

    public Teacher(Teacher teacher) {
        this.man = teacher.getMan();
        this.experience = teacher.getExperience();
    }

    public Teacher() {
        teach("123");
        teach("123", "1234");
        teach("123", "1234", "12345");

        System.out.println("конструктор");
    }

    public static void staticTeach() {
        System.out.println("статический метод");
    }

    @Override
    public void teach(String... names) {
        System.out.println("teacher");
    }

    public void see() {

    }

    @Override
    public Teacher getMan() {
        return new Teacher();
    }



    public void setExperience(int experience) {
        this.experience = experience;
    }

//    public Man getMan() {
//        return man;
//    }

    public void setMan(Man man) {
        this.man = man;
    }

    public int getExperience() {
        return 100;
    }

    public static int getColor() {
        return color;
    }
}
