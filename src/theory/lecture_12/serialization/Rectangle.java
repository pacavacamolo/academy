package theory.lecture_12.serialization;

import java.io.Serializable;
import java.util.Date;

/**
 * for second example
 *
 */
public class Rectangle extends Shape implements Serializable {
    private Date createdBy;
    private int radius = 5;
    private transient Thread thread = Thread.currentThread();

    public Rectangle() {
        System.out.println("конструктор потомка");
        createdBy = new Date();
    }

    //------------------------

    public Date getCreatedBy() {
        return createdBy;
    }

    public int getRadius() {
        return radius;
    }

    public Thread getThread() {
        return thread;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
}
