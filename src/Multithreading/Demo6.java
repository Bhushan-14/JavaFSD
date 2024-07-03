package Multithreading;

public class Demo6 extends Thread {
    static Thread t;
    @SuppressWarnings("removal")
    @Override
    public void run(){
        System.out.println("Thread is Running");
        t.stop();
        System.out.println("Thread dead");
    }
    public static void main(String[] args) {
        Demo6 te= new Demo6();
        t=new Thread(te);
        t.start();
    }

}