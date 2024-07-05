package Multithreading.Synchronization.SynchronizedBlockTask1;

public class SynchronizedBlock {
    void printTable(String studentName) {
        synchronized (this) {
            System.out.println("Student of Class ");
            for (int i = 1; i <= 4; i++) {
                System.out.println(studentName + " - Roll No. " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
            System.out.println();
        }
    }
}
