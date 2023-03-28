package com.java.strings;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class Read_file {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new BufferedReader(new FileReader("OutFile.txt")));
		while(sc.hasNextLine()) {
			String currentLine=sc.nextLine();
			System.out.println(currentLine);
		}

	}

}
