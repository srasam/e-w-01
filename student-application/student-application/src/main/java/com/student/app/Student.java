package com.student.app;
/**
 * Student.java
 * This is a model class represents a student entity
 * @author Sahasritha Rasam
 *
 */
public class Student {
	protected int student_id;
	protected String first_name;
	protected String last_name;
	protected String email;
	
	public Student(){
	
	}
	public Student(int student_id ){
		this.student_id=student_id;
		
	}
	public Student(int student_id ,String first_name,String last_name,String email){
		this.student_id=student_id;
		this.first_name=first_name;
		this.last_name=last_name;
		this.email=email;
	}
	public Student(String first_name,String last_name,String email){
		this.first_name=first_name;
		this.last_name=last_name;
		this.email=email;
	}
	
	
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
