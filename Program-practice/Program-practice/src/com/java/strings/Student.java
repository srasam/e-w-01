package com.java.strings;

//For this assignment, I want you to create two classes.
//
//One class is named “MainApplication”, another is named “Student”.
//
//We are going to add three variables to the Student class. The three variables are as follows:
//
//name – String
//gpa – Double
//collegeYear – String
//Create setter and getter methods for each of the three variables in the Student class.



public class Student {
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
