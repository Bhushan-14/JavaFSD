package ConditionalStatement;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Enter month (1-12): ");
        int month = sc.nextInt();
        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month entered.");
                System.exit(0);
        }
        System.out.println("Number of days: " + days);
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}