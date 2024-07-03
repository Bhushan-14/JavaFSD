package Multithreading;

public class Main {
    public static void main(String[] args) {
        int count = Thread.activeCount();
        System.out.println("\nActive threads: "+count);
        NewThread n1 = new NewThread();
        Thread t1 = new Thread(n1);
        t1.start();



        NewThread2 n2 = new NewThread2();
        Thread t2 = new Thread(n2);
        t2.start();

        int j = 0;
        while(j < 5){
            System.out.println("Main Thread running "+j);
            j++;
        }
        System.out.println("Main Thread Stopped");


    }


}