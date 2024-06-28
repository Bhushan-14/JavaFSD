package Array.Patterns;

import java.util.Scanner;

public class HolloSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of rows: ");
        int n = sc.nextInt();
        char[][] starArray = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    starArray[i][j] = '*';
                } else {
                    starArray[i][j] = ' ';
                }
                System.out.print(starArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
