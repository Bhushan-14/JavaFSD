package Multithreading;

public class THreadMehtodsDemo3Join {
    public static void main(String[] args) throws InterruptedException {
        ThreadMethodsDemo3 tj1 = new ThreadMethodsDemo3();
        ThreadMethodsDemo3Main tj2 = new ThreadMethodsDemo3Main();
        Thread t1 = new Thread(tj1);
        Thread t2 = new Thread(tj2);

        try {
            t1.start();
            t1.join(1000);

            t2.start();
            t2.join(2000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }
}
