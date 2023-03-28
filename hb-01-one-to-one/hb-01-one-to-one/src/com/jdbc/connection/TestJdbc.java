package com.jdbc.connection;

import java.sql.Connection;
import java.sql.*;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String username="hbstudent";
		String password="hbstudent";
		try {
			System.out.println("connecting to db "+jdbcUrl);
			Connection conn=DriverManager.getConnection(jdbcUrl,username,password);
			System.out.println("connection successful ");
		
			
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
