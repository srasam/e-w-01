package com.classicmodels.app;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class CustomerServletController
 */

public class CustomerServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CustomerDao customerDao;
    
    public CustomerServletController() {
        super();
        
    }
    
    @Override
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        customerDao = new CustomerDao(jdbcURL, jdbcUsername, jdbcPassword);
 
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		 
        try {
            switch (action) {
            case "/new":
                addCustomerForm(request, response);
                break;
            case "/insert":
                addCustomer(request, response);
                break;
            case "/delete":
                deleteCustomer(request, response);
                break;
           
            case "/update":
                updateCustomer(request, response);
                break;
            default:
                listCustomer(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
	}
	private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
		int id= Integer.parseInt(request.getParameter("customerNumber"));
		String firstName=request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Customer customer=new Customer(id,firstName,lastName);
	}


	private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("customerNumber"));
		customerDao.deleteCustomerById(id);
        response.sendRedirect("list");
		
	}
	
	private void addCustomerForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("addCustomer.jsp");
        dispatcher.forward(request, response);
		
	}

	private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int customerNumber=Integer.parseInt(request.getParameter("customerNumber"));
		String customerName = request.getParameter("customerName");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String addressLine1 = request.getParameter("addressLine1");
        String addressLine2 = request.getParameter("addressLine2");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String postalCode= request.getParameter("postalCode");
        String country= request.getParameter("country");
        int salesRepEmployeeNumber= Integer.parseInt(request.getParameter("salesRepEmployeeNumber"));
        double creditLimit=Double.parseDouble(request.getParameter("creditLimit"));
 
        Customer customer = new Customer(customerNumber,  customerName,  lastName,  firstName,
    			 phone,  addressLine1,  addressLine2,  city,  state,  postalCode,
    			 country,  salesRepEmployeeNumber,  creditLimit);
        customerDao.addCustomer(customer);
        response.sendRedirect("list");
		
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
