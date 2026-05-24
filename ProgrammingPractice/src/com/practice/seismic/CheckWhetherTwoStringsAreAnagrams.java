package com.practice.seismic;

public class CheckWhetherTwoStringsAreAnagrams {

	public static void main(String[] args) {
		
		String name1 = "Dileep".toLowerCase();
//		String name2 = "peelid".toLowerCase();
		String name2 = "Godishala".toLowerCase();
		
		
		
		if(getAnagramOfString(name1).equalsIgnoreCase(getAnagramOfString(name2)))	System.out.println("Anagram");
		else	System.out.println("NOT Anagrams");
		
		
	}
	
	public static String getAnagramOfString(String s) {
		
		char[] arr = s.toCharArray();;
		
		for(int i=0; i<s.length(); i++) {
			
			
			
			for(int j=i+1; j<s.length(); j++) {
				
				if(arr[i]>arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		return new String(arr);
		
	}

}
