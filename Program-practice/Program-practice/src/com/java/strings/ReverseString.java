package com.java.strings;

import java.util.Scanner;

public class ReverseString {

	static String recursiveReverse(String input_string) {
		if(input_string.length() == 1)
			return input_string;
		else
			return (input_string.charAt(input_string.length()-1))+ recursiveReverse(input_string.substring(0,input_string.length()-1));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input_string = sc.next();
		System.out.println(recursiveReverse(input_string));
		// USING FOR LOOP
		/*
		 * Scanner sc=new Scanner(System.in); String input_string=sc.next(); String
		 * reverse=""; System.out.println(input_string.length());
		 * System.out.println(input_string.substring(0, input_string.length()-1));
		 * //using for loop 
		 * for(int i=input_string.length()-1;i>=0;i--) {
		 * System.out.println(input_string.charAt(i));
		 * reverse=reverse+input_string.charAt(i); } System.out.println(reverse);
		 * sc.close();
		 *
		 */

		// USING STRING BUFFER
//		String input_string = "sahasritha";
//        StringBuffer sb = new StringBuffer(input_string);
//        System.out.println(sb.reverse());

		// USING RECURSIVE STRING
		/*
		 * ReverseString rs=new ReverseString(); 
		 * Scanner sc=new Scanner(System.in);
		 * String input=sc.next(); 
		 * String reverse=rs.recursiveReverse(input);
		 * System.out.println(reverse); 
		 * sc.close();
		 */

	}

}
