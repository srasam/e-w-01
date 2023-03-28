package com.java.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the decimal number: ");
		int number=Integer.parseInt(br.readLine());
		System.out.println("Number: "+number);
		String binary=Integer.toBinaryString(number);
		System.out.println("the binary number is: "+binary);
		

	}

}
