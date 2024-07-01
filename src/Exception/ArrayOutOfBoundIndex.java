package Exception;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutOfBoundIndex  {
    public static void main(String[] argns) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        try {
            System.out.println("Enter array elements: ");
            for (int i = 0;i <= arr.length;i++){
                arr[i] = sc.nextInt();
            }
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Array is: "+Arrays.toString(arr));
    }
}
