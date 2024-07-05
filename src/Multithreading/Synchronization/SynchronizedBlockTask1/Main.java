package Multithreading.Synchronization.SynchronizedBlockTask1;

public class Main {
    public static void main(String[] args) {
        SynchronizedBlock t = new SynchronizedBlock();
        DivA t1 = new DivA(t);
        DivB t2 = new DivB(t);
        DivC t3 = new DivC(t);
        t2.start();
        t1.start();
        t3.start();
    }
}