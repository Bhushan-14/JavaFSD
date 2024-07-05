package Multithreading.Synchronization.Task1;

public class SDemo1Expenses extends Thread {

    static double expenses;
    static SDemo1 s;
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        s.showExpenses(expenses
        );
        System.out.println("==============================================================================");
    }

    public static void main(String[] args) throws InterruptedException {
        s = new SDemo1();

        SDemo1Expenses traveling =new SDemo1Expenses();
        traveling.expenses=3500;
        traveling.start();
        Thread.sleep(1000);

        SDemo1Expenses food =new SDemo1Expenses();
        food.expenses=4000;
        food.start();
        Thread.sleep(1500);

        SDemo1Expenses accomaodation =new SDemo1Expenses();
        accomaodation.expenses=5000;
        accomaodation.start();
        //Thread.sleep(1500);

    }
}
