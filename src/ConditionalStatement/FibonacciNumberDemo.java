package ConditionalStatement;

import java.util.Scanner;

public class FibonacciNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            System.out.print(fibonacciNumber(i) + " ");
        }
    }
    static int fibonacciNumber(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
}

