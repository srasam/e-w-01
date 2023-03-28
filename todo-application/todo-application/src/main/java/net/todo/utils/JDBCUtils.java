package net.todo.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.sql.DriverManager;

public class JDBCUtils {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/to-do";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
        	e.printStackTrace();
        }
        return connection;
    }

    

    
}
