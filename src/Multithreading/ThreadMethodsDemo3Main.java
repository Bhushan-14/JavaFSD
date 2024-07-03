package Multithreading;

public class ThreadMethodsDemo3Main implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 2 is running");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: "+i);
        }
        System.out.println("Thread2 is ended");
    }
}
