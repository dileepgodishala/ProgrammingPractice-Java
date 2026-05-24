package com.infosys.interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FrequencyOfChar {
	// find the occurrence of each character in given string and
	// convert the character to uppercase
	public static void main(String[] args) {
		String str = "infosys hyderabad poornima bandi";
		String str1 = str.replaceAll(" ", "");
		System.out.println(str1);
		Set<Character> newStr = new HashSet();
		for (int i = 0; i <= str1.length() - 1; i++) {
			newStr.add(str1.charAt(i));
		}
		/*
		 * for( Character ch : newStr) { System.out.println(ch); }
		 *  
		 * 
		 */

		int count = 0;
		 Iterator<Character> it = newStr.iterator(); 
		 while(it.hasNext()) {
			 char outChar = it.next();
			 for(int j=0;j<=str1.length()-1;j++) {
				 if(str1.charAt(j)==outChar) {
					count++;
				 }
			 }
			 
			 System.out.println(Character.toUpperCase(outChar) +" " + count);
			 count = 0;
		 }
		 
		
	}

}
