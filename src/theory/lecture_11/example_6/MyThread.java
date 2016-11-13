package theory.lecture_11.example_6;

public class MyThread extends Thread {
    private final Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            service.increment();
        }
    }
}
