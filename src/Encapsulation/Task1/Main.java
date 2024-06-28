package Encapsulation.Task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        long accountNo = sc.nextLong();
        System.out.println("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();
        System.out.println("Enter ATM Number: ");
        int atmNo = sc.nextInt();
        Bank bankAccount = new Bank(accountNo, initialBalance, atmNo);

        int choice;
        do {
            System.out.println("\nBank Operations:");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bankAccount.displayAccountDetails();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    long depositAmount = sc.nextLong();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    long withdrawAmount = sc.nextLong();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (choice != 4) {
                System.out.print("Do you want to continue operations? (yes/no): ");
                sc.nextLine();
                String continueOps = sc.nextLine();
                if (continueOps.equalsIgnoreCase("no")) {
                    choice = 4;
                }
            }
        } while (choice != 4);
    }
}
