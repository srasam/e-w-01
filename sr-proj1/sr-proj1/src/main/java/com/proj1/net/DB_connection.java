package com.proj1.net;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class DB_connection {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;

	public DB_connection(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	protected void db_connect() throws SQLException {

		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				System.out.println(jdbcConnection);
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
	public void get_schema() throws SQLException {
		db_connect();
		System.out.println(this.jdbcConnection);
//		jdbcConnection.setSchema("bookstore");
//		System.out.println(jdbcConnection.getSchema());
		DatabaseMetaData databaseMetaData = jdbcConnection.getMetaData();
		ResultSet resultSet=databaseMetaData.getCatalogs();
		//ResultSet resultSet=jdbcConnection.getMetaData().getCatalogs();
		
		while (resultSet.next()) {
	        System.out.println("Schema - " + resultSet.getString("TABLE_CAT"));
	      }
		
//		System.out.println("schema name >>>> "+databaseMetaData.getUserName());
//		System.out.println(databaseMetaData.getSchemas());
//		String rs=rsmd.getSchemaName(1);	
//		System.out.println(col);
//		System.out.println(col_name1);
//		System.out.println(col_name);
//		System.out.println(rs);
		
//		System.out.println(resultSet.getString("TABLE_SCHEM"));
//		while(resultSet.next()) {
//			for(int i=0;i<=col;i++) {
//				System.out.println(resultSet.getString(i));
//			}
//		}
//		resultSet.close();
	
//		jdbcConnection.get
//		System.out.println(jdbcConnection.getSchema());		
//		String tables="SELECT * FROM student_db.student";
//		try (Statement stmt = jdbcConnection.createStatement()) {
//		      stmt.executeUpdate(tables);
//		      System.out.println("student table ");
//		    } catch (SQLException e) {
//		    	e.printStackTrace();
//		    }
	}
	
	
	public void get_tables() throws SQLException {
		db_connect();
		System.out.println(this.jdbcConnection);
		DatabaseMetaData databaseMetaData = jdbcConnection.getMetaData();
		
		String [] types= {"TABLE"};
		ResultSet rs=databaseMetaData.getTables(null,null, "%", types);
		while(rs.next()) {
			System.out.println(rs.getString("TABLE_NAME"));
		}
		
	}
	


}
