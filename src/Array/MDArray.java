package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of row: ");
        int n = sc.nextInt();
        System.out.println("Enter no. of column: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.deepToString(arr));
        }
        System.out.println("Enter the row index to insert the element: ");
        int row = sc.nextInt();
        System.out.println("Enter the column index to insert the element: ");
        int col = sc.nextInt();
        System.out.println("Enter the value to insert: ");
        int value = sc.nextInt();
        if (row >= 0 && row < n && col >= 0 && col < m) {
            arr[row][col] = value;
        } else {
            System.out.println("Invalid position.");
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
