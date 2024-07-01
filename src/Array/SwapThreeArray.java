package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapThreeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        System.out.println("Enter elements in the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements in the second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Enter elements in the third array:");
        for (int i = 0; i < n; i++) {
            arr3[i] = sc.nextInt();
        }

        System.out.println("Before swapping:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array 3: " + Arrays.toString(arr3));

        swapElements(arr1, arr2, arr3);

        System.out.println("After swapping:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array 3: " + Arrays.toString(arr3));
    }

    public static void swapElements(int[] arr1, int[] arr2, int[] arr3) {
        int n = arr1.length;

        for (int i = 0; i < n; i++) {
            int temp = arr1[i];
            arr1[i] = arr3[i];
            arr3[i] = arr2[i];
            arr2[i] = temp;
        }
    }
}
