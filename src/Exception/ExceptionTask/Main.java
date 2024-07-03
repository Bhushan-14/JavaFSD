package Exception.ExceptionTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static String accountNumber;
    private static String username;
    private static double balance;
    private static String password;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordAndUserNameValidator validator = new PasswordAndUserNameValidator();

        System.out.print("Enter username: ");
        username = sc.nextLine();

        String confirmPassword;
        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
            System.out.print("Confirm password: ");
            confirmPassword = sc.nextLine();

            if (validator.isValidPassword(password, confirmPassword)) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password is not valid. Please try again.");
            }
        } while (!validator.isValidPassword(password, confirmPassword));

        try {
            if (username == null || username.isEmpty()) {
                throw new UseNameexception("Username cannot be null or empty");
            }
            System.out.println("Username is valid.");
        } catch (UseNameexception e) {
            System.out.println(e.getMessage());
            return;
        }

        balance = 0.0;
        char choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Show Details");
            System.out.println("2. Add Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change Password");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);
            sc.nextLine();  // Consume newline
            switch (choice) {
                case '1':
                    showDetails();
                    break;
                case '2':
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case '3':
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        withdraw(withdrawAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '4':
                    changePassword(sc, validator);
                    break;
                case '5':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-5).");
            }

        } while (choice != '5');
    }

    private static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount should be greater than zero.");
        }
    }

    private static void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Withdraw amount should be greater than zero.");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    private static void showDetails() {
        System.out.println("Username: " + username);
        System.out.println("Balance: " + balance);
    }

    private static void changePassword(Scanner sc, PasswordAndUserNameValidator validator) {
        String newPassword;
        String confirmNewPassword;
        do {
            System.out.print("Enter new password: ");
            newPassword = sc.nextLine();
            System.out.print("Confirm new password: ");
            confirmNewPassword = sc.nextLine();

            if (validator.isValidPassword(newPassword, confirmNewPassword)) {
                password = newPassword;
                System.out.println("Password has been changed successfully.");
            } else {
                System.out.println("Passwords do not match or are invalid. Please try again.");
            }
        } while (!validator.isValidPassword(newPassword, confirmNewPassword));
    }
}
