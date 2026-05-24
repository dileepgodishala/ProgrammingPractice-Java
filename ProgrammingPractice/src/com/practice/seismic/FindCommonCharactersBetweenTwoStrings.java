package com.practice.seismic;

public class FindCommonCharactersBetweenTwoStrings {

	public static void main(String[] args) {
		
		String s1 = "abcde", s2= "cdefg";
		
		for(int i=0; i<s1.length(); i++) {
			
			for(int j=0; j<s2.length(); j++) {
				
				if(s1.charAt(i) == s2.charAt(j)) {
					
					System.out.print(s1.charAt(i));
					
					break;
					
				}
				
			}
			
		}
		
	}

}
