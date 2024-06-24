package Assignments;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Unit Digit Number is:"+(num%10));
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit = firstDigit/10;
        }
        System.out.println("First Digit Number is: " + firstDigit);

    }
}
