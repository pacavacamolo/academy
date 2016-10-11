package theory.reflection;

import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        A instance = new A();
        System.out.println(instance.getSecret());
        Class<A> c = A.class;
        Field f = c.getDeclaredField("secret");
        f.setAccessible(true);
        f.set(instance, 2);
        System.out.println(instance.getSecret());
    }
}

class A {
    final int secret;
    A () {
        secret = 1;
    }

    int getSecret() {
        return secret;
    }
}
