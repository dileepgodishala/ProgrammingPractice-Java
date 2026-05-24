package com.practice.seismic;


public class CountVowelsAndConsonantsInAstring {

	public static void main(String[] args) {

		String name = "Dileep Godishala";

		String s = name.replace(" ", "").toLowerCase();

		int vowelCount=0, consonentCount=0;

		for(char c: s.toCharArray()) {

//			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			if("aeiou".indexOf(c) != -1) {
				
				vowelCount++;
				
			}
			else	consonentCount++;
			
			
		}
		
		System.out.println("Vowels: " + vowelCount);
		
		System.out.print("Consonent: " + consonentCount);

	}

}
