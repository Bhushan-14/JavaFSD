package Multithreading;

public class ThreadMethodsDemo3 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 1 is running");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: "+i);
        }
        System.out.println("DivA is ended");
    }
}
