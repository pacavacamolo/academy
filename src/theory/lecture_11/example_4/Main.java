package theory.lecture_11.example_4;

/**
 * Класс демонстрирует возможность перевести поток из состояния RUNNABLE  в TIMED_WAITING
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        Thread thread1 = new MyThread(service);
        thread1.start();

        synchronized (service) {
            System.out.println("главный поток ждет");
            service.wait(1);
            System.out.println("thread1 занял монитор объекта service и мы увидим эту строку только когда монитор освободится");
        }
        System.out.println(service.getCounter());
    }
}
