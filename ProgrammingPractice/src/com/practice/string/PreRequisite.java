package com.practice.string;

public class PreRequisite {

	public static void main(String[] args) {
		
		//Check if string is between (a to l) or (m to z)
		
		char ch = 'a';
		if((ch >= 'a') && (ch <='l')) {
			System.out.println("Character is between a-l");
		}
		else if((ch >='m') && (ch <= 'z')) {
			System.out.println("Character is between m-z");
		}
			
	}

}
