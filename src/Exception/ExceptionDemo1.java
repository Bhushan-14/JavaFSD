package Exception;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number to divide: ");
        int n = sc.nextInt();
        int a = 60;
        try {
            int result = a / n;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Number is not divisible by 0 due to "+e);
        }
    }
}
