package com.java.strings;

//Punith Reddy- E12642034
import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// prompt user for first name
		System.out.println("Enter your First Name: ");
		// Accept the user's first name and store it as a variable.
		String first_name = sc.nextLine();

		boolean isValid = false;
		// Validate that the variable has a length greater than 0.
		// a. If the length of that variable is equal to qr less than 0, keep prompting the user for their first name until an acceptable one is entered.
		while (!isValid) {
			System.out.println("Please Enter your First Name: ");
			first_name = sc.nextLine();
			if (first_name.length() > 0) {
				isValid = true;
				}
			}
		//Prompt the user for their favorite food.
		System.out.println("Enter your favorite food: ");
		//Accept the user's favorite food and store it as a variable.
		String favorite_food = sc.next();
		if (favorite_food.length() <= 0) {
			System.out.println("Enter your favorite food: ");
		}
//		Print out the greeting: Hi, my name is «first name variable> and my favorite food is «favorite food
//		variable», using the proper Java code to print it in one System.out.println statement.
		System.out.println("Hi, my name is " + first_name + " and my favorite food is " + favorite_food);

		System.out.println("\n");
		System.out.println("Printing numbers ascending order: ");
		// Using a for loop, print 0-10 in ascending order (least to greatest).
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("\n");
		//Using a for loop, print 0-10 in descending order (greatest to least).
		System.out.println("Printing numbers descending order: ");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

	}

}
