package theory.lecture_11.example_2;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        while (Thread.interrupted()) {
            System.out.println("работает MyRunnable");
        }
    }

}
