package com.java.strings;

import java.util.Scanner;

public class RemoveDuplicateFromString {
	
	public static String reverse_string(String str) {
		String newString="";
		for(int i=str.length()-1;i>=0;i--) {
			newString=newString+str.charAt(i);
			
		}
		return newString;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input_str=sc.next();
		System.out.println(reverse_string(input_str));
		
		
		
	}

}
