package com.student.app;

import java.sql.SQLException;

public class TestDBConnection {

	public static void main(String[] args) throws SQLException {
		/*
		 * String first_name="Paulo"; String last_name="Coelho"; String
		 * email="Coelho@abc.com"; StudentDAO s=new
		 * StudentDAO("jdbc:mysql://localhost:3306/student_db","root","root");
		 * s.connect(); Student _student=new Student(first_name,last_name,email);
		 * //s.add_student(_student);
		 */		
		StudentDAO s=new StudentDAO("jdbc:mysql://localhost:3306/student_db","root","root");
		s.list_all_students();
		
	}

}
