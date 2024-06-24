package Assignments;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Net Salary :");
        double salary = sc.nextDouble();
        System.out.println("Your basic salary is : "+(salary*40)/100);
        System.out.println("Your HRA is: "+(salary*10)/100);
        System.out.println("Your TAM is: "+(salary*15)/100);
        System.out.println("Your PF is: "+(salary*20)/100);
        System.out.println("Your Medical expenses is: "+(salary*15)/100);

        System.out.println("Your Total salary is : "+(((salary*40)/100)+((salary*10)/100)+((salary*15)/100)+((salary*20)/100)+((salary*15)/100)));
    }
}
