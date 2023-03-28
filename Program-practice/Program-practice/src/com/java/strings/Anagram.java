package com.java.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	/*
	 * public static String sort_characters(String word) 
	 * { 
	 * char [] input_word= word.toLowerCase().toCharArray(); 
	 * System.out.println(input_word);
	 * Arrays.sort(input_word); 
	 * System.out.println(String.valueOf(input_word));
	 * return String.valueOf(input_word);
	 *} 
	 *public static boolean isAnagramUsingArraySort(String word_1,String word_2)
	 * { 
	 * String sorted_word_1=sort_characters(word_1);
	 * System.out.println(sorted_word_1); 
	 * String sorted_word_2=sort_characters(word_2); 
	 * System.out.println(sorted_word_2);
	 * return sorted_word_1.equals(sorted_word_2); 
	 * }
	 */
	public static void main(String[] args) {
		//Two string are anagrams if they have same characters but in different order : angel angle
		
		//By sorting
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first word: ");
		
		String word_1=sc.next();
		System.out.println("enter second word: ");
		java.lang.String word_2=sc.next();
		
		
		System.out.println("Is Anagram:" +isAnagram(word_1,word_2));
		
		

	}
	
	public static boolean isAnagram(String first, String word_2) {
		 
        char[] charactersOfFirst = first.replaceAll("\\s", "").toLowerCase().toCharArray();
        
        char[] charactersOfSecond = word_2.replaceAll("\\s", "").toLowerCase().toCharArray();
    
 
        if (charactersOfFirst.length != charactersOfSecond.length) {
            return false;
        }
 
        int[] frequencies = new int[26];
 System.out.println(charactersOfFirst.length);
        for (int i = 0; i < charactersOfFirst.length; i++) {
            frequencies[charactersOfFirst[i] - 'a']++;
           
            frequencies[charactersOfSecond[i] - 'a']--;
        }

        for (int frequency : frequencies) {
            if (frequency != 0) return false;
        }
 
        return true;
}

}
