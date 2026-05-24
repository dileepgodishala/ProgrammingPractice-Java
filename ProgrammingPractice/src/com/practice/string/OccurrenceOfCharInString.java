package com.practice.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OccurrenceOfCharInString {

	public static void main(String[] args) {
		OccurrenceOfCharInString occurrence = new OccurrenceOfCharInString();
		occurrence.singleCharOccurrence("Ppoornnimaaa");

	}
	
	public void singleCharOccurrence(String str) {
		//string - inserting into Set 
		//print check for duplicates
		//compare input string with collected characters
		//count occurrence of each character
		String newStr = str.toLowerCase();
		int count=0;
		Set<Character> hs = new HashSet<Character>();
		for(int i=0;i<=newStr.length()-1;i++) {
			 Character ch = newStr.charAt(i);
			 hs.add(ch);
		}
		for(Character ltr : hs) {
			for(int j=0;j<=newStr.length()-1;j++) {
				if(ltr.equals(newStr.charAt(j))) {
					count++;
				}
				
			}
			System.out.println(ltr + " " + count);
			count =0;
		}
		
		
	}

}
