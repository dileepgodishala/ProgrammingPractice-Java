package com.practice.seismic;

import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;

public class FindDuplicateCharactersInAString {

	public static void main(String[] args) {
		
		String name = "Dileep Kumar Godishala".toLowerCase().replace(" ", "");
		
		int length = name.length();
		
		String result = "";
		
		
		//Bruteforce
		
		for(int i=0; i<length; i++) {
			
			boolean isDuplicate = false;
			
			char currentCharacter = name.charAt(i);
			
			for(int j=0; j<i; j++) {
				
				if(currentCharacter == name.charAt(j)) {
					
					isDuplicate = true;
					
					break;
					
				}
					
			}
			
			if(!isDuplicate) {
				result = result + currentCharacter;
			}
			
		}
		
		System.out.println(result);
		
		
		System.out.println("---------------- Using Set ------------------------");
		
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<length; i++) {
			
			set.add(name.charAt(i));
			
		}
		
		for(char c: set)	System.out.print(c);
		
		
		
		
		
	}

}
