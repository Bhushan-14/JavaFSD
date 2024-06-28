package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is: " + Arrays.toString(arr));
        arr[0] = arr[3] / 5;
        arr[1] = arr[5] * 10;
        arr[2] = arr[4] + 50;

        System.out.println("Manipulated array is: " + Arrays.toString(arr));
    }
}
