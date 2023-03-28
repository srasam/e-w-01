package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1: set content type
		response.setContentType("text/html");
		
		//step 2: get the printwriter
		PrintWriter out=response.getWriter();
		//step3: generate the HTML content
		out.println("<html><body>");
		out.println("The student is: "+request.getParameter("firstName")+" "+request.getParameter("lastName"));
		out.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
