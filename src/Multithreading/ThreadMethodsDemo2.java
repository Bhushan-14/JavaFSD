package Multithreading;

public class ThreadMethodsDemo2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Iteration " + i);
//            try {
////                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println(Thread.currentThread().getName() + " is ended");
    }

    public static void main(String[] args) {
        ThreadMethodsDemo2 t = new ThreadMethodsDemo2();

        Thread t1 = new Thread(t, "Thread 1");
        Thread t2 = new Thread(t, "Thread 2");

        t1.start();
        t2.start();

        try {
            t1.join(1000);
            System.out.println(t1.getName() + " has finished.");

            t2.join(2000);
            System.out.println(t2.getName() + " has finished.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main Thread ended");
    }
}
