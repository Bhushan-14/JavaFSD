package Multithreading;

public class Demo4 extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Demo4 mt = new Demo4();
        Thread.currentThread().setName("Umesh");
        mt.run();
        Demo4 mt1 = new Demo4();
        mt1.run();
        Demo4  mt2 = new Demo4();
        mt2.run();
    }
}