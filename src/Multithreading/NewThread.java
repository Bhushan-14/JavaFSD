package Multithreading;
public class NewThread implements Runnable {
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("First Thread running "+i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.getMessage();

            }
        }

        System.out.println("First Thread Stopped");
    }

}
