package Array.ThreeDArray;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l: ");
        int l = sc.nextInt();
        System.out.println("Enter m: ");
        int n = sc.nextInt();
        System.out.println("Enter n: ");
        int m = sc.nextInt();
        int[][][] arr = new int[l][m][n];
        System.out.println("Enter Array elements: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.println(Arrays.deepToString(arr[i]));
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
