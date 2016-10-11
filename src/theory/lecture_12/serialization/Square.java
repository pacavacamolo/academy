package theory.lecture_12.serialization;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * for third example
 */
public class Square implements Serializable {
    private Date createdBy;
    private int radius = 5;


    private void writeObject(ObjectOutputStream out) throws IOException {
        throw new NotSerializableException("Не сегодня!");
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        throw new NotSerializableException("Не сегодня!");
    }

    public Square() {
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

}
