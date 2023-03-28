package com.java.strings;

import java.util.Scanner;

public class EqualDigitCount {
	public boolean digitCount(String num) {
        int ar[] = new int[10];
        for (int i = 0; i < num.length(); i++) {
            ar[(num.charAt(i)) - 48]++;
        }
        for (int i = 0; i < num.length(); i++) {
            if (ar[i] != num.charAt(i) - 48)
                return false;
        }
        return true;
    }
	
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		
		EqualDigitCount e=new EqualDigitCount();
		e.digitCount(input);
		
	}

}
