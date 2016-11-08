package theory.lecture_10.io.ex_5_objects;

import java.io.Serializable;

/**
 * Created by Антон on 06.11.2016.
 */
public class MyObject implements Serializable {
    private int x = 5;
    private String string = "Это строка";

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "x=" + x +
                ", string='" + string + '\'' +
                '}';
    }
}
