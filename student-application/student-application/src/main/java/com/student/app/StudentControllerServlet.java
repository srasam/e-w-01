package com.student.app;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import javax.servlet.RequestDispatcher;





public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAO student_DAO;
	public void init() {
		 String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		 System.out.println(jdbcURL);
	        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
	        System.out.println(jdbcUsername);
	        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
	        System.out.println(jdbcPassword);
	 
	        student_DAO = new StudentDAO(jdbcURL, jdbcUsername, jdbcPassword);
	}
    
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
        System.out.println(action);
 
        try {
            switch (action) {
            case "/new":
            	newForm(request, response);
                break;
            case "/insert":
            	insertStudent(request, response);
                break;
            case "/delete":
            	deleteStudent(request, response);
                break;
            case "/edit":
            	editForm(request, response);
                break;
            case "/update":
            	updateStudent(request, response);
                break;
            default:
            	listStudents(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
	}

	
	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		  int id = Integer.parseInt(request.getParameter("student_id"));
	        String first_name = request.getParameter("first_name");
	        String last_name = request.getParameter("last_name");
	        String email = request.getParameter("email");
	 
	        Student student=new Student(id,first_name,last_name,email);
	        student_DAO.update_student(student);
	        response.sendRedirect("list");
		
	}



	private void editForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("student_id"));
        Student existing_student = student_DAO.get_students(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("StudentForm.jsp");
        request.setAttribute("student", existing_student);
        dispatcher.forward(request, response);
		
	}



	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("student_id"));
		Student student=new Student(id);
		student_DAO.delete_student(student);
		response.sendRedirect("list");
	}



	private void insertStudent(HttpServletRequest request, HttpServletResponse response) {
		
		
	}



	private void newForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	}
	
	/*METHODS:
	 * default: listStudents();
	 * 1.newForm();
	 * 2.editForm();
	 * 3.insertStudent();
	 * 4.updateStudent();
	 * 5.deleteStudnet();
	 * 
	 */
	 private void listStudents(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	    	System.out.println("Printing list of students");
	        List<Student> _list_students = student_DAO.list_all_students();
	        request.setAttribute("listStudents", _list_students);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("StudentList.jsp");
	        dispatcher.forward(request, response);
	    }

}
