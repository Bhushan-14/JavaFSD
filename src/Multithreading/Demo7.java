package Multithreading;

public class Demo7 implements Runnable{
    Thread t2;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
            System.out.println("Second Thread "+i);
            t2.stop();
            }
        }
    }
}
