package com.practice.string;

import java.util.HashSet;
import java.util.Set;

public class CountOfCharacters {	
	public static void main(String args[]) {
		String input = "My Name is Poornima";
		String newStr = input.toLowerCase();
		String Str = newStr.replaceAll(" ", "");
		System.out.println(Str);
		int count=0;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<=Str.length()-1;i++) {
			set.add(Str.charAt(i));
		}
		System.out.println(set);
		for(Character c : set) {
			//System.out.println(c);
				
			for(int i=0;i<=Str.length()-1;i++) {
				if(c.equals(Str.charAt(i))) {
					count++;
				}
			}
			System.out.println(c +" "+ count);
			count=0;
		}
		
	}

}
