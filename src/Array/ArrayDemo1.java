package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is: "+ Arrays.toString(arr));
        sc.nextLine();
        String[] strArray = new String[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            strArray[i] = sc.nextLine();
        }
        System.out.println("Entered array is: ");
        for (String i : strArray) {
            System.out.println(i);
        }
    }
}
