package Multithreading;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
        int i = 0;
        while (i < 10 && !Thread.currentThread().isInterrupted()) {
            System.out.println(i + " ");
            if (i == 5) {
                Thread.currentThread().interrupt();
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
