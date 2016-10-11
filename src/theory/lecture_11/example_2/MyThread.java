package theory.lecture_11.example_2;

public class MyThread extends Thread {

    public void run() {
        System.out.println("работает Mythread");
        while (!interrupted()) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("прервано");
            }
        }
    }
}
