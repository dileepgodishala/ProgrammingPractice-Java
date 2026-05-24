package com.practice.string;

public class CheckIfAllAlphabetsArePresent {

	public static void main(String[] args) {

		String str = "AaaBbxyzbcasdqwertyui098765&^%$#@opasdfgjklzcvbnm,.DEFgHIjkL2345NoPqRStuvWxYz67890-=";
		//convert upper case to lower case
		//boolean isPresent = false
		//loop over string
		
		String smlStr = str.toLowerCase();
		System.out.println(smlStr);
		boolean isAlpha = false;
		for(int i=0;i<=smlStr.length()-1;i++) {
			if(smlStr.charAt(i) >= 'A' && smlStr.charAt(i) <='Z') {
				isAlpha = true;
			}
		}
		System.out.println(isAlpha);
	}
	
}
