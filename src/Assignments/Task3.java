package Assignments;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much dozen of fruits u have : ");
        int quantity = sc.nextInt();
        System.out.println("You have "+quantity*12+" numbers of fruits");
    }
}
