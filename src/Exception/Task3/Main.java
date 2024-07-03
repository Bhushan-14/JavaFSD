package Exception.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] a = new int[5];
            System.out.println("Enter a elements");
            for (int i = 0; i <= 6; i++) {
                if (i >= a.length) {
                    throw new ArrayoutOfBoundException("Array is too small to store these values");
                }
                a[i] = sc.nextInt();
            }
        } catch (ArrayoutOfBoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            String name = null;
            if (name == null) {
                throw new NullPointerStrings("Null strings are not acceptable");
            }
        } catch (NullPointerStrings e) {
            System.out.println(e.getMessage());
        }
    }
}
