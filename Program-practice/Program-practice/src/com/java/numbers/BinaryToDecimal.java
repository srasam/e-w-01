package com.java.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToDecimal {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the binary number: ");
		String number=br.readLine();
		int decimal=Integer.parseInt(number,2);
		String octal=Integer.toOctalString(decimal);
		System.out.println("the decimal number is: "+decimal);
		System.out.println("the octal number is: "+octal);
		

	}

}
