package theory.lecture_5.interfaces_and_abstract;

//этот интерфейс может быть использован всеми классами, объекты которых должны использовать run()
public interface Runnable {

    // методы интерфейса всегда публичные, переменные - всегда public static final
    void run();
}
