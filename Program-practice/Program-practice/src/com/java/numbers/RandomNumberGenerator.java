package com.java.numbers;

import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		// 1.Randomly generate a number between 1 and 10.
		int min = 1;
		int max = 10;
		int random_number = (int) Math.floor(Math.random() * (max - min + 1) + min);
		int number;
		// 2.Prompt the user for a number between 1 and 10.
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a number between 1 and 10: ");
			number = sc.nextInt();
			// 3. If the number is greater than 10:
//			Print “I’m sorry, the number entered is greater than 10. Please try again.”
//			Prompt the user to input again.
			if (number > 10) {
				System.out.println("I’m sorry, the number entered is greater than 10. Please try again.");
			}
//		4. If the number is less than 1:
//			Print “I’m sorry, the number entered is less than 1. Please try again.”
//			Prompt the user to input again.
			else if (number < 1) {
				System.out.println("I’m sorry, the number entered is less than 1. Please try again.");
			} else if (number != random_number) {
				System.out.println("I’m sorry, that guess was not the random number.");
			}
		}
//		5. If the user has not guessed successfully:
//			Print “I’m sorry, that guess was not the random number.”
//			Keep prompting the user until they get it right.
//		6. If the user successfully guesses, display “Congratulations, you correctly guessed! The random number was randomNumber” (Random number is the variable that should be used)
		while (number != random_number);
		System.out.println("Congratulations, you correctly guessed! The random number was " + random_number);

	}

}
