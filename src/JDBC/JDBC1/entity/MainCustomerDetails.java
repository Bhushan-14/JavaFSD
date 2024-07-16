package JDBC.JDBC1.entity;

import JDBC.JDBC1.connection.DatabaseConnection;
import JDBC.JDBC1.dao.CustomerDao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCustomerDetails {

    private int customerID;
    private String customerName;
    private int billNo;
    private double billAmount;

    public MainCustomerDetails(int customerID, String customerName, int billNo, double billAmount) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.billNo = billNo;
        this.billAmount = billAmount;
    }

    public MainCustomerDetails() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DatabaseConnection conn = new DatabaseConnection();

        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("++++++++++++++++++++++");
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for update");
            System.out.println("Press 3 for delete");
            System.out.println("Press 4 to exit");
            System.out.println("Enter your Choice: ");
            try {
                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline left-over

                switch (choice) {
                    case 1:
                        System.out.println("Enter customerID:");
                        int customerID = sc.nextInt();
                        sc.nextLine(); // Consume newline left-over
                        System.out.println("Enter customerName:");
                        String customerName = sc.nextLine();
                        System.out.println("Enter billNo:");
                        int billNo = sc.nextInt();
                        System.out.println("Enter billAmount:");
                        double billAmount = sc.nextDouble();
                        MainCustomerDetails customer = new MainCustomerDetails(customerID, customerName, billNo, billAmount);
                        CustomerDao.insertCustomer(customer);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        continueLoop = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine();
            }
        }
    }
}
