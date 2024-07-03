package Multithreading;

public class OneThreadMultipleTask implements Runnable {

    int a = 10;
    int b = 20;

    @Override
    public void run() {
        addition();
        subtraction();
        multiplication();
        division();
        modulus();
    }

    void addition() {
        System.out.println("Addition: " + (a + b));
    }

    void subtraction() {
        System.out.println("Subtraction: " + (a - b));
    }

    void multiplication() {
        System.out.println("Multiplication: " + (a * b));
    }

    void division() {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    void modulus() {
        if (b != 0) {
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Modulus by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        OneThreadMultipleTask task = new OneThreadMultipleTask();
        Thread thread = new Thread(task);
        thread.start();
    }
}
