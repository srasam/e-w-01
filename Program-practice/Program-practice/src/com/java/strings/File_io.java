package com.java.strings;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_io {

	public static void main(String[] args) throws IOException {
		try(PrintWriter out=new PrintWriter(new FileWriter("OutFile.txt"))){
		out.println("First line in the file");
		out.println("Second line in the file");
		out.println("Third line in the file");
		}

	}

}
