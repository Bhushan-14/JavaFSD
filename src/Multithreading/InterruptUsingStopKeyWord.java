package Multithreading;

public class InterruptUsingStopKeyWord implements Runnable {
    private volatile boolean stop = false;
    @Override
    public void run() {
        System.out.println("Thread is running");
        int i = 0;
        while (i < 10 && !stop) {
            System.out.println(i + " ");
            if (i == 5) {
                stop = true;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        InterruptUsingStopKeyWord t = new InterruptUsingStopKeyWord();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
