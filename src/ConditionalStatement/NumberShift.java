package ConditionalStatement;

import java.util.Scanner;
class NumberShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String numberStr = String.valueOf(number);
        if (numberStr.length() <= 1) {
            System.out.println("Invalid input. Number should have more than 1 digit.");
        }
        String shiftedNumberStr = numberStr.substring(1) + numberStr.charAt(0);
        int shiftedNumber = Integer.parseInt(shiftedNumberStr);

        System.out.println("Original number: " + number);
        System.out.println("Shifted number: " + shiftedNumber);
    }
}
