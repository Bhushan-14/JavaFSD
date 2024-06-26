package OOPS.Methods;

import java.util.Scanner;

public class CalculateReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter Time period for you want to invest: ");
        double year = sc.nextDouble();
        double sipRate = 12.0;
        double rdRate = 7.0;
        double fdRate = 6.5;
        double siRate = 5.5;
        double savingAccRate = 4.0;

        double sipAmount = calcSIP(amount, sipRate, year);
        double rdAmount = calcRD(amount, rdRate, year);
        double fdAmount = calcFD(amount, fdRate, year);
        double siAmount = calcSI(amount, siRate, year);
        double savingAccAmount = calcSavingAccount(amount, savingAccRate, year);

        System.out.printf("Return of SIP is: %.2f%n", sipAmount);
        System.out.printf("Return of RD is: %.2f%n", rdAmount);
        System.out.printf("Return of FD is: %.2f%n", fdAmount);
        System.out.printf("Return of SI is: %.2f%n", siAmount);
        System.out.printf("Return of Savings Account is: %.2f%n", savingAccAmount);

        double maxAmount = Math.max(sipAmount, Math.max(rdAmount, Math.max(fdAmount, Math.max(siAmount, savingAccAmount))));
        String bestOption = "";

        if (maxAmount == sipAmount) {
            bestOption = "SIP";
        } else if (maxAmount == rdAmount) {
            bestOption = "RD";
        } else if (maxAmount == fdAmount) {
            bestOption = "FD";
        } else if (maxAmount == siAmount) {
            bestOption = "Simple Interest";
        } else {
            bestOption = "Savings Account";
        }
        System.out.printf("The best investment option is: %s  with maturity amount: %.2f",bestOption,maxAmount);
    }

    public static double calcSIP(double P, double annualRate, double years) {
        double r = annualRate / 12 / 100;
        double n = years * 12;
        return P * (Math.pow(1 + r, n) - 1) / r * (1 + r);
    }

    public static double calcRD(double P, double annualRate, double years) {
        double r = annualRate / 100;
        double n = years * 12;
        return P * n + P * (n * (n + 1)) / 2 * (r / 12);
    }

    public static double calcFD(double P, double annualRate, double years) {
        double r = annualRate / 100;
        return P * Math.pow(1 + r, years);
    }

    public static double calcSI(double P, double annualRate, double years) {
        double r = annualRate / 100;
        return P + (P * r * years);
    }

    public static double calcSavingAccount(double P, double annualRate, double years) {
        double r = annualRate / 100;
        int n = 1;
        return P * Math.pow(1 + r / n, n * years);
    }
}
