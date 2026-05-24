package com.practice.seismic;

public class FindFirstNonRepeatedCharacterInAString {

	public static void main(String[] args) {
		
		String name = "aabbcddee";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<name.length(); i++) {
			
			int count=0;
			
			for(int j=0; j<name.length(); j++) {
				
				if(name.charAt(i) == name.charAt(j))	count++;
				
			}
			
			if(count==1) {
				System.out.println("First non-repeating character is: " + name.charAt(i));
				break;
			}
			
		}
		
		
	}

}
