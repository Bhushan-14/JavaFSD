package Multithreading;

public class NewThread2 implements Runnable{

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Second Thread running "+i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.getMessage();

            }
        }

        System.out.println("Second Thread Stoppped");
    }
}
