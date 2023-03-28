package jspdemo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class TableServlet
 */
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TableDao tableDao;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		
		tableDao=new TableDao(jdbcURL,jdbcUsername,jdbcPassword);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String action = request.getServletPath();
	        System.out.println(action);
	        try {
	        switch(action) {
	        case "/new":
	        	createNewTable(request,response);	
	        case "/list":
			    listTable(request, response);
			    break;
			}
	        }catch(SQLException ex) {
	            throw new ServletException(ex);
	        }

	}
	
	
	private void listTable(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		System.out.println("Printing somethings fromlistTable");
        List<String> listTable = tableDao.listAllTables();
        request.setAttribute("List_Table", listTable);
        RequestDispatcher dispatcher = request.getRequestDispatcher("create-table.jsp");
        dispatcher.forward(request, response);
	}
	private void createNewTable(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String tablename=request.getParameter("table_name");
		tableDao.create_table(tablename);
		RequestDispatcher dispatcher = request.getRequestDispatcher("create-table.jsp");
        dispatcher.forward(request, response);
		
		
	}

	

}
