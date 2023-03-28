package com.java.numbers;

import java.util.Scanner;

public class Prime {

	static void isPrime(int input_number) {
		int count = 0, i = 2;

		while (i < input_number) {
			if (input_number % i == 0) {
				count++;
				break;
			}
			i++;
		}
		if (input_number == 1 || input_number == 0)
			System.out.println("Not Prime");
		else if(count == 0)
			System.out.println("is Prime");
		else
			System.out.println("Not Prime");

	}

	public static void main(String[] args) {
		// prime number- when a num is divisible by only 1 and itself
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		isPrime(num);

	}

}
