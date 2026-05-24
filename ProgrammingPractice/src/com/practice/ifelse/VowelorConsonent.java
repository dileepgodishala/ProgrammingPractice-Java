package com.practice.ifelse;

public class VowelorConsonent {
	public static void main(String args[]) {
		char ch = 'e';
		System.out.println(isChar(ch));
	}
	public static String isChar(char ch1) {
		if("aeiouAEIOU".contains(String.valueOf(ch1))) {
			//System.out.println(ch1 + " is Vowel");
			return "Vowel";
		}
		else {
			//System.out.println(ch1 + " is Consonent");
			return "Consonent";
		}
		
	}
}
