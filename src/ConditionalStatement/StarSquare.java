package ConditionalStatement;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of the squar: ");
        int sideLength = sc.nextInt();
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

