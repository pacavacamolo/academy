package practice.seminar_5;

/**
 * Created by StudentTC on 20.10.2016.
 */
public class Driver extends Man {
    int x = 10;
    int y = 5;
    int z = 5;
    private int experience = 15;


    @Override
    public void teach(String... names) {
        System.out.printf("222");
    }

    @Override
    public void methodAbstract() {

    }

    @Override
    public int hashCode() {
        y = x*31;
        z = y*31;
        return x + y + z;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getExperience() {
        return 200;
    }
}
