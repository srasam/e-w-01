package com.java.strings;

import java.util.Scanner;

public class Palindrome {
	
	static String checkPalindrome(String input_string) {
		
		if(input_string.length()==1)
			return input_string;
		else
			return(input_string.charAt(input_string.length()-1))+ checkPalindrome(input_string.substring(0,input_string.length()-1));
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input_string = sc.next();
		System.out.println("reverse of the string: "+checkPalindrome(input_string));
		String reverse=checkPalindrome(input_string);
		if(reverse.equals(input_string)) {
			System.out.println("is a palindrome");
		}
		else
			System.out.println("is not a palindrome");

	}

}
