package Multithreading;

public class ThreadMethodsDemo1 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        Thread.yield();
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        ThreadMethodsDemo1 t1 = new ThreadMethodsDemo1();
        Thread th1 = new Thread(t1);
        th1.setPriority(Thread.MIN_PRIORITY);

        ThreadMethodsDemo1 t2 = new ThreadMethodsDemo1();
        Thread th2 = new Thread(t2);
        th2.setPriority(Thread.NORM_PRIORITY);

        ThreadMethodsDemo1 t3 = new ThreadMethodsDemo1();
        Thread th3 = new Thread(t3);
        th3.setPriority(Thread.NORM_PRIORITY + 2);

        ThreadMethodsDemo1 t4 = new ThreadMethodsDemo1();
        Thread th4 = new Thread(t4);
        th4.setPriority(Thread.MAX_PRIORITY);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
