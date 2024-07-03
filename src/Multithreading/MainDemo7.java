package Multithreading;

public class MainDemo7 {
    public static void main(String[] args) {
        Demo7 st = new Demo7();
        Thread t2 = new Thread(st);
        t2.start();
    }
}
