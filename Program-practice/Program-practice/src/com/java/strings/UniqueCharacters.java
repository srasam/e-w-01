package com.java.strings;

import java.util.HashSet;

public class UniqueCharacters {
	public static boolean uniqueCharacters(String str) {
		HashSet charSet=new HashSet();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!charSet.add(c))
				return false;
			
		}
		return true;
		
	}

}
