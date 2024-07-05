package Multithreading.Synchronization.Task1;

import Multithreading.Synchronization.Task1.Insufficientexpenses;

public class SDemo1 {
    static double total_salary =30000;
    static double expenses;
    static double remaining;

    void showExpenses(double expenses){
        if(total_salary>expenses){
            System.out.println("payment succesful");
            total_salary= total_salary-expenses;
            remaining =total_salary;
            System.out.println("remaining Amount "+ remaining);

        }else{
            System.out.println("insufficent Funds...!!!! try again");
            try {
                throw new Insufficientexpenses("check your Balance");
            } catch (Insufficientexpenses e) {
                throw new RuntimeException(e);
            }
        }

    }
}
