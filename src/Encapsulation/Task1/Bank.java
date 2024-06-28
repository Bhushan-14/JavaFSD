package Encapsulation.Task1;

public class Bank {
    private long account_no;
    private double balance;
    private long check_no;
    private int ATM_NO;

    public Bank(long account_no, double initial_balance, int ATM_NO) {
        this.account_no = account_no;
        this.balance = initial_balance;
        this.ATM_NO = ATM_NO;
    }

    public long getAccount_no() {
        return account_no;
    }
    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }
    public int getATM_NO() {
        return ATM_NO;
    }
    public void deposit(long amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + getBalance());
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(long amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + getBalance());
        } else {
            System.out.println("Invalid withdrawal amount. Check your balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + getAccount_no());
        System.out.println("Balance: " + getBalance());
        System.out.println("ATM Number: " + getATM_NO());
    }
}
