package com.java.strings;

import java.util.Arrays;

public class Anagram_2 {
	
	static boolean isAnagram(String s1, String s2) {
		char [] c1=s1.replaceAll("\\s","").toCharArray();
		char [] c2=s2.replaceAll("\\s","").toCharArray();
		System.out.println(c1);
		System.out.println(c2);
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("eth er","there"));

	}

}
