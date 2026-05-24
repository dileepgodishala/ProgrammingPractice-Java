package com.practice.seismic;

import java.util.HashSet;

public class CountOccurrenceOfEachCharacterInAString {

	public static void main(String[] args) {
		
		String name = "Dileep Kumar Godishala".toLowerCase().replace(" ", "");
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(char c: name.toCharArray())	set.add(c);
		
		for(char c: set) {
			
			int charCount = 0;
			
			for(int i=0; i<name.length(); i++) {
				
				
				if(c == name.charAt(i)) {
					charCount++;
				}
				
			}
			
			System.out.println(c + " count is: "+ charCount);
			
		}
		
		
		
	}

}
