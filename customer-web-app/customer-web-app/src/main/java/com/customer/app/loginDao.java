package com.customer.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDao {
	public Login checkLogin(String customerName, String customerNumber) throws SQLException,
    ClassNotFoundException {
		String jdbcURL="jdbc:mysql://127.0.0.1:3306/classicmodels?useSSL=false";
		String dbUser= "mysqladmin";
		String dbPassword= "Mysql12345!";

Class.forName("com.mysql.jdbc.Driver");
Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
String sql = "SELECT * FROM classicmodels.customers WHERE customerName = ? and customerNumber= ? ";
PreparedStatement statement = connection.prepareStatement(sql);
statement.setString(1, customerName);
statement.setString(2, customerNumber);

ResultSet result = statement.executeQuery();

Login user = null;

if (result.next()) {
    user = new Login();
    user.setUsername(result.getString("customerName"));
    
}

connection.close();

return user;
}
	

}
