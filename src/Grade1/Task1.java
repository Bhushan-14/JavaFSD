package Grade1;

import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter today's date (dd-mm-yyyy): ");
        String t_date = sc.nextLine();

        System.out.println("Enter birth date (dd-mm-yyyy): ");
        String b_date = sc.nextLine();

        String[] t_dateParts = t_date.split("-");
        String[] b_dateParts = b_date.split("-");

        int t_day = Integer.parseInt(t_dateParts[0]);
        int t_month = Integer.parseInt(t_dateParts[1]);
        int t_year = Integer.parseInt(t_dateParts[2]);

        int b_day = Integer.parseInt(b_dateParts[0]);
        int b_month = Integer.parseInt(b_dateParts[1]);
        int b_year = Integer.parseInt(b_dateParts[2]);

        int age_years = t_year - b_year;
        int age_months = t_month - b_month;
        int age_days = t_day - b_day;

        if (age_days < 0) {
            age_days = age_days + 30;
            age_months--;
        }
        if (age_months < 0) {
            age_months = age_months + 12;
            age_years--;
        }
        System.out.println("Age: " + age_years + " years, " + age_months + " months, and " + age_days + " days.");
    }
}
