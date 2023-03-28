package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		System.out.println();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// create student object
			System.out.println("creating new student obj");
			Student student = new Student("Gwen", "Stacy", "stacy@luv2code.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("saving the student");
			System.out.println(student);
			session.save(student);

			// commit transaction
			session.getTransaction().commit();
			System.out.println("done");
			
			//find out the students id: primary key
			System.out.println("saved student.Generated id: "+ student.getId());
			
			//get a new session and start transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on id: primary key
			
			System.out.println("\nGetting studnet with id: "+ student.getId());
			
			Student myStudent= session.get(Student.class,student.getId());
			
			System.out.println("Get complete: "+myStudent);
			
			session.getTransaction().commit();
			
			System.out.println("Done");
		} finally {
			factory.close();
		}
		

	}

}
