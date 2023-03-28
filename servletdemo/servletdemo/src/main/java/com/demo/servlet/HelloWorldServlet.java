package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public HelloWorldServlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter writer=response.getWriter();
	    writer.println("<!DOCTYPE><html><head><title>Welcome Servlet</title></head>");
	    writer.println("<body><h3>Welcome to servlets</h3></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
