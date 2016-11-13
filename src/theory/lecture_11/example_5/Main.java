package theory.lecture_11.example_5;

/**
 * Класс демонстрирует возможность задавать приоритет потокам.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new MyThread();
        thread1.setName("Первый поток");
        Thread thread2 = new MyThread();
        thread2.setName("Второй поток");

        thread1.setPriority(10);
        thread2.setPriority(1);

        thread1.start();
        thread2.start();

        thread2.setDaemon(true);
    }
}
