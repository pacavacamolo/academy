package theory.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class EverythingIsTrue {
    static void setFinalStatic(Field field, Object newValue) throws Exception {
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, newValue);
    }
    public static void main(String args[]) throws Exception {
        setFinalStatic(Boolean.class.getField("FALSE"), true);
        Boolean test = false;
        System.out.println("Everything is " + test); // "Everything is true"
    }
}