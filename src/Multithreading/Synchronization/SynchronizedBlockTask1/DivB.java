package Multithreading.Synchronization.SynchronizedBlockTask1;

public class DivB extends Thread{
    SynchronizedBlock t;
    @Override
    public void run() {
        t.printTable("B");
    }
    DivB(SynchronizedBlock t){
        this.t = t;
    }
}
