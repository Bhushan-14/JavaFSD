package Multithreading;

public class Demo2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20;i++){
            if(i % 2 == 0){
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");
        Demo2 demo2 = new Demo2();
        Thread t = new Thread(demo2);
        t.start();

        System.out.println("Run thread");
        demo2.run();
    }
}
