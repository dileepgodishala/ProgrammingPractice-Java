package com.practice.seismic;

import java.util.ArrayList;
import java.util.List;

public class FindLongestPalindromeSubstring {

	public static void main(String[] args) {
		
		//Get Substring or get all substrings
		//Check if it is palindrome
		//Check length and check highest
		
		String s = "alsdkjbaslvavndadmamadamwow";
		
		List<String> list = getAllPalindromes(s);
		
		int longestPalindromeCount = 0;
		String longestPalindrome = "";
		
		for(String a: list) {
			
			String revStr ="";
			
			for(int i=a.length()-1; i>=0; i++) {
				
				revStr = revStr + a.charAt(i);
				
			}
			
			if(a.equalsIgnoreCase(revStr)) {
				
				if(a.length() > longestPalindromeCount) {
					
					
					longestPalindromeCount = a.length();
					longestPalindrome = a;
				}
				
			}
			
		}
		
		System.out.println("Longest palindrome: " + longestPalindrome);
		
		
	}
	
	public static List<String> getAllPalindromes(String a) {
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<a.length(); i++) {
			
			for(int j=0; j<a.length(); j++) {
				
				list.add(a.substring(i, j));
				
			}
			
		}
		
		return list;
	}

}
