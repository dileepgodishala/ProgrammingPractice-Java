package com.practice.seismic;

public class RemoveAllSpecialCharactersFromString {

	public static void main(String[] args) {
		
		String s = "123!@#$%^&*()_+/*sdfgnj,.";
		
		String result = "";
		
		//Bruteforce
		for(int i=0; i<s.length(); i++) {
			
			if(Character.isLetterOrDigit(s.charAt(i))) {
				result = result + s.charAt(i);
			}
		}
		
		System.out.println("String without special caracters: " + result);
		
		
		//Regular expression
		System.out.println(s.replaceAll("[^a-zA-Z0-9 ]", ""));
		
		
		
	}

}
