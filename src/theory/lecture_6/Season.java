package theory.lecture_6;

/**
 * Created by StudentTC on 25.10.2016.
 */
public enum Season {
    WINTER(90),
    SPRING(93),
    SUMMER(92),
    AUTUMN(91);

    private int countOfDays;
    private int countOfDays2;

    Season(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public int getCountOfDays2() {
        return countOfDays2;
    }

    public void setCountOfDays2(int countOfDays2) {
        this.countOfDays2 = countOfDays2;
    }
}
