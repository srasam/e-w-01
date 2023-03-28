package com.java.strings;

//In the MainApplication class, create your standard main method.
//
//In your main method, create a new student using this code snippet:
//
//Student stu = new Student();
//
//If you coded your class correctly, this will work.
//
//Now, prompt the user for user input for the student’s name, gpa, and the year they are in college.
//
//Save it to the stu object user the setter methods you created for each of the variables.
//
//Finally, print out each variable using the getter methods for each of the variables.
//
//AT THE TOP OF YOUR MainApplication CLASS, COMMENT YOUR NAME AND E-NUMBER.


import java.util.Scanner;
   class Employee {
	//three variables
	String name;
	double gpa;
	String collegeYear;
	
	//setters/getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getCollegeYear() {
		return collegeYear;
	}
	public void setCollegeYear(String collegeYear) {
		this.collegeYear = collegeYear;
	}
	

}

public class MainApplication {

	// main method
	public static void main(String[] args) {
		// promt the user input for the student's name,gpa,college_year
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name: ");
		String name = sc.next();
		System.out.println("Enter student gpa: ");
		double gpa = sc.nextDouble();
		System.out.println("Enter student college year");
		String collegeYear = sc.next();

		// new student
		Student stu = new Student();
		
		

		// Save it to the stu object user the setter methods you created for each of the
		// variables.
		stu.setName(name);
		stu.setGpa(gpa);
		stu.setCollegeYear(collegeYear);
		System.out.println("\nStudent Details");

		// print out each variable using the getter methods for each of the variables.
		System.out.println("Name: " + stu.getName() + " GPA: " + stu.getGpa() + " College Year: " + stu.getCollegeYear());
	}
}
