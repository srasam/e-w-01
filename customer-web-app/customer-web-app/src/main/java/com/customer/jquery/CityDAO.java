package com.customer.jquery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CityDAO {
	private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
     
    public CityDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
     
	
    protected void connect() throws SQLException {
    	System.out.println("BookDAO->connect(): jdbcConnection 1: " + this.jdbcConnection);
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
			
				Class.forName("com.mysql.jdbc.Driver");
				jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				System.out.println(this.jdbcConnection);
				if (this.jdbcConnection != null) {
					System.out.println("DB connection sucessful");
				} else {
					System.out.println("DB connection unsucessful");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	 public List<City> listAllRows() throws SQLException {
	        List<City> listCity = new ArrayList<>();
	         
	        String sql = "SELECT * FROM city";
	         
	        connect();
	         
	        Statement statement = jdbcConnection.createStatement();
	        ResultSet resultSet = statement.executeQuery(sql);
	         
	        while (resultSet.next()) {
	            int id = resultSet.getInt("ID");
	            String name = resultSet.getString("Name");
	            String country_code = resultSet.getString("CountryCode");
	            String district = resultSet.getString("District");
	            String info = resultSet.getString("Info");
	            
	             City city=new City(id,name,country_code,district,info);
	             
	             listCity.add(city);
	        }
	         
	        resultSet.close();
	        statement.close();
	         
	        disconnect();
	         
	        return listCity;
	    }
	 
	 public String testString() {
		 String name="sweety";
		 return name;
	 }

}
