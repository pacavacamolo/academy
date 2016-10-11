package theory.lecture_11.example_4;

public class MyThread extends Thread {
    final Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        synchronized (service) {
            for (int i = 0; i < 1000; i++) {
                service.increment();
            }
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
