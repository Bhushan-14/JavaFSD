package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter number of elements in the sub-array: ");
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] sarr = new int[m];

        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter elements in the sub-array:");
        for (int i = 0; i < m; i++) {
            sarr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sub-array: " + Arrays.toString(sarr));

        if (isSubArray(arr, sarr)) {
            System.out.println("The sub-array is part of the main array.");
        } else {
            System.out.println("The sub-array is not part of the main array.");
        }
    }

    public static boolean isSubArray(int[] arr, int[] sarr) {
        int n = arr.length;
        int m = sarr.length;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (arr[i + j] != sarr[j]) {
                    break;
                }
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }
}
