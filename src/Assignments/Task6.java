package Assignments;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = sc.nextLine().charAt(0);
        int ASCII_Value = (int) character;
        System.out.println("The ASCII value of " + character + " is: " + ASCII_Value);
    }
}
