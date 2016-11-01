package theory.lecture_5.object;

public class Main {
    public static void main(String[] args) throws Throwable {
        //все объекты являются наследниками Object, т.е. имеют все неприватные методы.
        Main object1 = new Main();
        Object object2 = new Object();

        //для проверки эквивалентности (hashcode() - предварительная оценка)
        int hash = object1.hashCode();
        boolean isEqual = object1.equals(object2);

        //представляем объект в виде строки
        String objectAsString = object1.toString();

        //для рефлексиии - работы с классом объекта
        Class clazz = object1.getClass();

        //для создания копии объекта
        object1.clone();

        //выполняется перед удалением объекта сборщиком мусора, на практике не нужно его использовать
        object1.finalize();

        //wait notify notifyAll - методы для работы в многопоточном приложении
    }
}
