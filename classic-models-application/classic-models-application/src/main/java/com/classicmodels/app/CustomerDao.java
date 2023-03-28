package com.classicmodels.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDao {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;

	public CustomerDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("connnection sucessful");

		}
	}

	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}

	public void addCustomer(Customer customer) {
		Connection conn = null;
		PreparedStatement myStmt = null;
		String sql = "INSERT INTO customers (customerNumber,customerName,contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			connect();
			myStmt = conn.prepareStatement(sql);
			myStmt.setInt(1, customer.getCustomerNumber());
			myStmt.setString(2, customer.getCustomerName());
			myStmt.setString(3, customer.getContactLastName());
			myStmt.setString(4, customer.getContactFirstName());
			myStmt.setString(5, customer.getPhone());
			myStmt.setString(6, customer.getAddressLine1());
			myStmt.setString(7, customer.getAddressLine2());
			myStmt.setString(8, customer.getCity());
			myStmt.setString(9, customer.getState());
			myStmt.setString(10, customer.getPostalCode());
			myStmt.setString(11, customer.getCountry());
			myStmt.setInt(12, customer.getSalesRepEmployeeNumber());
			myStmt.setDouble(13, customer.getCreditLimit());

			int rows = myStmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A new user has been inserted  into the table");
			}
			disconnect();
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Customer> ListAllCustomers() throws SQLException {

		List<Customer> listCustomer = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
		//get a connection 
		connect();
		//create SQL statement
		String sql = "SELECT * FROM customers ";
		myStmt = myConn.createStatement();
		//execute query
		myRs = myStmt.executeQuery(sql);
		//process result set
		while (myRs.next()) {
			//retrieve data from result set row
		
			int id = myRs.getInt("customerNumber");
			String customerName = myRs.getString("customerName");
			String firstName = myRs.getString("contactFirstName");
			String lastName = myRs.getString("contactLastName");
			String phone = myRs.getString("phone");
			String addressLine1 = myRs.getString("addressLine1");
			String addressLine2 = myRs.getString("addressLine2");
			String city = myRs.getString("city");
			String state = myRs.getString("state");
			String postalCode = myRs.getString("postalCode");
			String country = myRs.getString("country");
			int salesRepEmployeeNumber = myRs.getInt("salesRepEmployeeNumber");
			double creditLimit = myRs.getDouble("creditLimit");
			// create a new customer object- make use of customer constructor that we created
			Customer customer = new Customer(id, customerName, firstName, lastName, phone, addressLine1, addressLine2,
					city, state, postalCode, country, salesRepEmployeeNumber, creditLimit);
			//add to list of customers
			listCustomer.add(customer);

		}
		return listCustomer;
		}
		finally {
			//close JDBC objects
			close(myConn,myStmt,myRs);
		}

	}
	private void close(Connection myConn,Statement myStmt,ResultSet myRs) {
		try {
			if(myRs != null) {
				myRs.close();
			}
			if(myStmt !=null) {
				myStmt.close();
			}
			if(myConn !=null) {
				myConn.close();//does not really close the db connection..just puts back in connection pool making it available for others to use
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
}


	public void deleteCustomerById(Integer customerNumber) {
		Connection conn = null;
		PreparedStatement myStmt = null;
		String sql = "DELETE FROM customers WHERE customerNumber=?";
		try {
			connect();
			myStmt = conn.prepareStatement(sql);
			myStmt.setInt(1, customerNumber);
			int rows = myStmt.executeUpdate();
			if (rows > 0) {
				System.out.println("User " + customerNumber + " has been deleted form the table");
			} else
				System.out.println("Entered customerID doesnot exist");
			myStmt.close();
			disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateCustomerById(String newCustomerLastName, String newCustomerFirstName, Integer customerNumber) {
		Connection conn = null;
		PreparedStatement myStmt = null;
		String sql = "UPDATE customers SET contactLastName=?,contactFirstName=? WHERE customerNumber=?";
		try {
			connect();
			myStmt = conn.prepareStatement(sql);
			myStmt.setString(1, newCustomerLastName);
			myStmt.setString(2, newCustomerFirstName);
			myStmt.setInt(3, customerNumber);
			int rows = myStmt.executeUpdate();
			if (rows > 0) {
				System.out.println("User " + customerNumber + "LastName and FirstName has been updated");
			}
			myStmt.close();
			disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
