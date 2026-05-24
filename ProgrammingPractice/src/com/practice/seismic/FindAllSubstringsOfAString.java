package com.practice.seismic;

public class FindAllSubstringsOfAString {

	public static void main(String[] args) {
		
		String name = "Dileep Godishala".toLowerCase().replace(" ", "");
		
		int lengthOfString = name.length();
		
		int count =0;
		
		for(int i=0; i<lengthOfString-1; i++) {
			
			for(int j=i+1; j<=lengthOfString; j++) {
				
				String subString = name.substring(i, j);
				
				System.out.println(subString);
				
				count++;
				
			}
			
		}
		
		System.out.println(count);
		
		System.out.println(lengthOfString* (lengthOfString+1)/2);
		
		
		
	}

}
