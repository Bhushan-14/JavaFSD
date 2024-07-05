package Multithreading.Synchronization.SynchronizedBlockTask1;

public class DivA extends Thread{
    SynchronizedBlock t;
    @Override
    public void run() {
        t.printTable("A");
    }
    DivA(SynchronizedBlock t){
        this.t = t;
    }
}
