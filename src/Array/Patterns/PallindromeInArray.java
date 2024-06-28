package Array.Patterns;

import java.util.Scanner;

public class PallindromeInArray {
        public static boolean isPalindrome(int number) {
            int original = number;
            int reverse = 0;
            while (number > 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;
            }
            return original == reverse;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int palindromeCount = 0;
        for (int i = 0; i < n; i++) {
             if (isPalindrome(array[i])) {
                 palindromeCount++;
            }
        }
        System.out.println("Number of palindromic numbers in the array: " + palindromeCount);
    }
}

