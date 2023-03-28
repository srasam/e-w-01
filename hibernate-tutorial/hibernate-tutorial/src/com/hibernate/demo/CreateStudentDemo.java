package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		System.out.println();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// create student object
			System.out.println("creating new student obj");
			Student student = new Student("joe", "Daniel", "daniel@abc.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("saving the student");
			session.save(student);

			// commit transaction
			session.getTransaction().commit();
			System.out.println("done");
		} finally {
		}

	}

}
