package theory.lecture_11.example_2;

/**
 * прерывание потока
 */
public class Main {

    public static void main(String[] args) {
        Thread myThread = new MyThread();                                   // NEW
        Thread myRunnable = new Thread(new MyRunnable());                   // NEW

        myThread.start();                                                   //RUNNABLE
        myRunnable.start();                                                 //RUNNABLE

        myThread.interrupt();                                              // TERMINATED
        myRunnable.interrupt();                                             // TERMINATED






    }
}
