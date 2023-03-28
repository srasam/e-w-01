package com.java.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	public void removeDuplicate(String s) {
		//LinkedHashSet<Character> set=new LinkedHashSet<>();
		HashSet<Character>set1=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			//set1.add(s.charAt(i));
			set1.add(s.charAt(i));
	     //set.add(s.charAt(i));
			//System.out.println(s.charAt(i));
//		System.out.println(set.add(s.charAt(i)));
		
		}
//		for(Character ch:set) {
//			System.out.println(ch);
//		}
		for(Character ch:set1) {
			System.out.println(ch);
		}
	}
//	public void removeDuplicates(String s) {
//		s=s.replaceAll("\\s", "");
//		System.out.println(s);
//		char []charArray=s.replaceAll("\\s", "").toCharArray();
//		System.out.println(charArray);
//		//return s;
//		
//	}
	public static void main(String []args) {
		RemoveDuplicates duplicate=new RemoveDuplicates();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		duplicate.removeDuplicate(str);
		sc.close();
	}

}
