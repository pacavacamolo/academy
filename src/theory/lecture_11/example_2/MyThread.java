package theory.lecture_11.example_2;

public class MyThread extends Thread {

    public void run() {
        while (true) {
            System.out.println("работает Mythread");
            try {
                sleep(1);
            } catch (InterruptedException e) {
                System.out.println("прервано");
            }

        }
    }
}
