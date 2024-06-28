package Array.Patterns;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of rows: ");
        int n = sc.nextInt();
        char[][] starArray = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println((starArray[i][j] = '*')+" ");
            }
            System.out.println();
        }
    }
}
