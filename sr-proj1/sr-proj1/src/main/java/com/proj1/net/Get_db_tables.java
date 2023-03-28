package com.proj1.net;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Get_db_tables {
	private Connection jdbcConnection;
	public void get_tables() {
		String tables="SELECT * FROM student_db.student";
		try (Statement stmt = jdbcConnection.createStatement()) {
		      stmt.executeUpdate(tables);
		      System.out.println("student table ");
		    } catch (SQLException e) {
		    	e.printStackTrace();
		    }
	}
	public static void main(String []args) {
		Get_db_tables td=new Get_db_tables();
		td.get_tables();
		
	}
}
