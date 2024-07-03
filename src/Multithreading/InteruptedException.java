package Multithreading;

public class InteruptedException implements Runnable {
    private String task;
    InteruptedException(String task) {
        this.task = task;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(task + i + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(task + "Thread was interrupted");
        }
    }

    public static void main(String[] args) {
        InteruptedException obj = new InteruptedException("Task ");
        Thread thread = new Thread(obj);
        thread.start();

//        thread.interrupt();
    }
}
