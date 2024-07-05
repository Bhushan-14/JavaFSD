package Multithreading.Synchronization.SynchronizedBlockTask1;

public class DivC extends Thread{
    SynchronizedBlock t;
    @Override
    public void run() {
        t.printTable("C");
    }
    DivC(SynchronizedBlock t){
        this.t = t;
    }
}
