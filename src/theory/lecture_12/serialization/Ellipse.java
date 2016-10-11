package theory.lecture_12.serialization;

import java.io.Serializable;
import java.util.Date;

/**
 * for first example
 */
public class Ellipse implements Serializable {
    private Date createdBy;
    private int radius = 5;
    private static long length = 1;

//    это единственное static поле, которое сериализуется.
//    При компиляции в класс всегда добавляется это поле, его значение рассчитывается
//    в зависимости от полей, их значение, порядка полей, порядка методов в классе.
//    serialVersionUID стоит самому передопределять, если есть вероятность, что в классе методы будут добавляться, меняться.
//    с 5 версии Java это поле всегда советуют добавлять в сериализуемый класс.
    private static final long serialVersionUID = 31232132111543L;

    public Ellipse() {
        createdBy = new Date();
    }

    //------------------------

    public Date getCreatedBy() {
        return createdBy;
    }

    public int getRadius() {
        return radius;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public static long getLength() {
        return length;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setLength(long length) {
        Ellipse.length = length;
    }
}
