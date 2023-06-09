package com.tracker.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;


@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user="springstudent";
		String password="springstudent";
		
		String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
	    String driver="com.mysql.cj.jdbc.Driver";
	    
	    //connect to DB
	    try {
	    	PrintWriter out=response.getWriter();
	    	out.println("connecting to DB: "+ jdbcUrl);
	    	Class.forName(driver);
	    	Connection myConn=DriverManager.getConnection(jdbcUrl,user,password);
	    	out.println("Sucessfully Connected to DB");
	    	myConn.close();
	    	
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    	throw new ServletException(e);
	    }
		
	}

}
