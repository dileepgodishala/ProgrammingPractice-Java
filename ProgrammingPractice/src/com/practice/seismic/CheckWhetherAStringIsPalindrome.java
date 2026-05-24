package com.practice.seismic;

public class CheckWhetherAStringIsPalindrome {

	public static void main(String[] args) {
		
//		String s = "Dileep Godishala";
		String s = "Madam";
		
		String sa = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			sa = sa + s.charAt(i);
			
		}
		
		if(sa.equalsIgnoreCase(s))	System.out.println("Palindrome");
		else	System.out.println("NOT a palindrome");
		

	}

}
