package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo1 {
    private static final String URL = "jdbc:mysql://localhost:3308/d1";
    private static final String USER = "root";
    private static final String PASSWORD = "potato";
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connect Successfully");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            throw new RuntimeException(e);
        }
        return conn;
    }

    public static void main(String[] args) {
        try {
            Connection connection = getConnection();
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}