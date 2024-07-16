package JDBC.JDBC1.dao;

import JDBC.JDBC1.connection.DatabaseConnection;
import JDBC.JDBC1.entity.MainCustomerDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDao {

    public static void insertCustomer(MainCustomerDetails customer) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO customerDetails (customerID, customerName, bill_no, billAmount) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, customer.getCustomerID());
            statement.setString(2, customer.getCustomerName());
            statement.setInt(3, customer.getBillNo());
            statement.setDouble(4, customer.getBillAmount());

            boolean result = statement.execute();
            if (!result) {
                System.out.println("Customer inserted successfully.");
            } else {
                System.out.println("Error inserting customer: ");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting customer: " + e.getMessage());
        }
    }
    public static void delete(int Cid) throws SQLException {
        String query = "DELETE FROM customerDetails WHERE customerID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, Cid);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Deleted Successfully");
            } else {
                System.out.println("No rows found with the provided ID.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting customer: " + e.getMessage());
        }
    }
}
