package JDBC.JDBC1.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection conn;
    private static final String URL = "jdbc:mysql://localhost:3308/customerDetails";
    private static final String USER = "root";
    private static final String PASSWORD = "potato";

    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            if(conn != null){
                System.out.println("Connected successfully");
            } else {
                System.out.println("Connection failed");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
