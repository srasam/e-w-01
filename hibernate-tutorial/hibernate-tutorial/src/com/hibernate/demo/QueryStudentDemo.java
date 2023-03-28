package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		System.out.println();
		// create session
		Session session = factory.getCurrentSession();

		try {
			

			// start a transaction
			session.beginTransaction();

			//query students
			List<Student> theStudents=session.createQuery("from Student").list();
			
			//display students
			
			displayStudents(theStudents);
			//query students: lastName='Doe'
			theStudents =session.createQuery("from Student s where s.lastname='Daniel'").list();
			
			
			//display the students
			System.out.println("\n\nStudents who have last name Doe");
			if(theStudents.isEmpty()) {
				System.out.println("No student found!!");
			}else
				displayStudents(theStudents);
				

			// commit transaction
			session.getTransaction().commit();
			System.out.println("done");
		} finally {
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
		
	}

}
