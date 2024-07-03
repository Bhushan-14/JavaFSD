package Multithreading;

public class Demo1 extends Thread{
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Demo1 demo1 = new Demo1();
        demo1.run();
//        demo1.start();
    }

    @Override
    public void run() {
        System.out.println("Run method");
        for (int i = 0; i < 50; i++){
            System.out.println(i+" ");
        }
    }
}
