package com.classicmodels.app;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Test_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDao customerDao; 
   
    public Test_Servlet() {
        super();
        
    }
    @Override
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        customerDao = new CustomerDao(jdbcURL, jdbcUsername, jdbcPassword);
 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			listCustomer(request, response);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	private void listCustomer(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		//get customers from DB util
        List<Customer> customer = customerDao.ListAllCustomers();
        //add customers to list
        request.setAttribute("CUSTOMER_LIST", customer);
        //send tp JSP page(view)
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list-customers.jsp");
        dispatcher.forward(request, response);
    }

}
