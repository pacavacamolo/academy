package theory.lecture_6;

import java.io.Serializable;

/**
 * Created by StudentTC on 25.10.2016.
 */
public class A implements Serializable {
    private Interf b;

    public A(Interf b) {
        this.b = b;
    }

    public void method() {
        b.method();
    }
}
