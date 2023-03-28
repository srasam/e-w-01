package com.student.app;

/**
 * Student.java
 * This is a DAO class that performs CRUD operation on students table in DB
 * @author Sahasritha Rasam
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class StudentDAO {
	/*
	 * methods: 1. connect(): connection to db 2. disconnet():close the db
	 * connection 3. add_students():insert studentdetails to db 4.list_students():
	 * retrive all students from db 5.update_student(): update student details
	 * 6.delete_student():delete student from db 7.get_students(): get student
	 * details
	 * 
	 */
	private String url;
	private String user_name;
	private String password;
	private Connection jdbcConnection;

	public StudentDAO(String url, String user_name, String password) {
		this.url = url;
		this.user_name = user_name;
		this.password = password;
	}

	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");

			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(url, user_name, password);
			System.out.println("connection sucessful!");
		}

	}

	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
			System.out.println("connection is closed");
		}
	}

	public boolean add_student(Student _student) throws SQLException {
		String sql = "INSERT INTO student (first_name, last_name, email) VALUES (?, ?, ?)";
		connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, _student.getFirst_name());
		statement.setString(2, _student.getLast_name());
		statement.setString(3, _student.getEmail());

		boolean rowInserted = statement.executeUpdate() > 0;
		System.out.println(rowInserted);
		System.out.println("Student added sucessfully");
		statement.close();
		disconnect();
		return rowInserted;
	}

	public List<Student> list_all_students() throws SQLException {
		List<Student> student_list = new ArrayList<>();
		String sql_query = "SELECT * FROM student";
		connect();
		Statement statement = jdbcConnection.createStatement();
		ResultSet result_set = statement.executeQuery(sql_query);
		System.out.println(result_set);
		
		while (result_set.next()) {
			int id = result_set.getInt("student_id");
			String first_name = result_set.getString("first_name");
			String last_name = result_set.getString("last_name");
			String email = result_set.getString("email");
			Student student = new Student(id, first_name, last_name, email);
			student_list.add(student);
			System.out.println(student_list);

		}

		
		statement.close();

		disconnect();

		return student_list;
	}
	public boolean update_student(Student student) throws SQLException {
        String sql = "UPDATE student SET first_name = ?, last_name = ?, email = ?";
        sql += " WHERE student_id = ?";
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, student.getFirst_name());
        statement.setString(2, student.getLast_name());
        statement.setString(3, student.getEmail());
        statement.setInt(4, student.getStudent_id());
         
        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;     
    }
	public boolean delete_student(Student student) throws SQLException {
        String sql = "DELETE FROM student where student_id = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, student.getStudent_id());
         
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;     
    }
	public Student get_students(int id) throws SQLException {
        Student student = null;
        String sql = "SELECT * FROM student WHERE student_id = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);
         
        ResultSet result_set = statement.executeQuery();
         
        if (result_set.next()) {
            String first_name =result_set.getString("first_name");
            String last_name = result_set.getString("last_name");
            String email = result_set.getString("email");
             
            student = new Student(id, first_name, last_name, email);
        }
         
        result_set.close();
        statement.close();
         
        return student;
    }

}
