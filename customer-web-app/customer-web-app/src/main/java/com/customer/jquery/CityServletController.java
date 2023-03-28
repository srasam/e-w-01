package com.customer.jquery;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;



public class CityServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CityDAO cityDAO;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		cityDAO = new CityDAO(jdbcURL, jdbcUsername, jdbcPassword);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
//		try {
//			listCity(request,response);
//		} catch (SQLException | IOException | ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String action=request.getContextPath();
		System.out.println(action);
		try {
			switch(action) {
			default:
				listCity(request,response);
			}
		}catch(Exception e) {
			System.out.println(e);
		}

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	private void listCity(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		System.out.println("Printing  from listCity");
		//String a=cityDAO.testString();
		List<City> listCity = cityDAO.listAllRows();
		
		request.setAttribute("listCity", listCity);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/List.jsp");
		dispatcher.forward(request, response);
	}
	
//	private void testJsp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String a="sweety";
//		request.setAttribute("name", a);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/List.jsp");
//		dispatcher.forward(request, response);
//	}

}
