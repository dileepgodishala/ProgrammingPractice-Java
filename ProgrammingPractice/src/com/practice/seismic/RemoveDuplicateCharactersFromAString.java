package com.practice.seismic;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharactersFromAString {

	public static void main(String[] args) {
		
		String name = "Dileep Godishala".toUpperCase().replace(" ", "");
		
		String finalString = "";
		
		//Approach 1
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char c : name.toCharArray())	 set.add(c);
		
		for(char c: set) {
			
			finalString = finalString + c;
			
		}
		
		System.out.println("Without duplicates: " + finalString);
		
		
//		//Approach 2
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0; i<name.length(); i++) {
//			
//			
//			
//		}
		
		
		
	}

}
