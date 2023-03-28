package com.java.numbers;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		
		System.out.println("Even numbers: ");
		for (int i = 0; i <= 50; i++) {

			if (i % 2 == 0) {

				System.out.println(i);
			}

		}
		System.out.println("Odd numbers: ");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {

				System.out.println(i);
			}

		}
		

	}
}
