package theory.lecture_11.example_3;

/**
 * Класс демонстрирует возможность перевести поток из состояния Runnable в Waiting
 * и после завершения цикла другого потока вернуть его обратно.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        Thread thread1 = new MyThread(service);
        thread1.start();

        synchronized (service) {
            System.out.println("main thread waiting for notify...");
            service.wait();
        }
        System.out.println(service.getCounter());
    }
}
