package com.java.apachecommons;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

		String file = "src\\demo_csv.csv";
		BufferedReader reader=null;
		String line="";
		try {
			reader=new BufferedReader(new FileReader(file));
		}catch(Exception e) {
			
		}finally {
			
		}
	}

}
 