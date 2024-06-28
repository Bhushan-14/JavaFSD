package Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                temp++;
            }
        }
        int[] evenArr = new int[temp];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[index++] = arr[i];
            }
        }
        System.out.println("Entered array of even numbers is: " + Arrays.toString(evenArr));
    }
}
