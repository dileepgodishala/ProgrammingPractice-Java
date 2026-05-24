package com.practice.seismic;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CompressAString_aabbbcc_a2b3c2 {

	public static void main(String[] args) {
		
		String name = "aabbbccaaadd";
		
		
		//This approach's time complexity is O(n) square
		//Also when name = "aabbbccddaa"
		//Expected output is a2b3c2d2a2
		//Actual output is a4b3c2d2
		char[] arr = name.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char c: arr) set.add(c);
		
		Iterator<Character> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			char c = itr.next();
			
			int count =0;
		
			for(int j=0; j<name.length(); j++) {
				
				if(c == name.charAt(j)) {
					count++;
				}
			}
			
			System.out.print(c);
			System.out.print(count);
			
		}
		
		
		System.out.println("\n-------------- Actual approach-------------------------");
		
		int length1 = name.length(); 
		int count=1;
		
		for(int i=0; i<length1-1; i++) {
			
			if(i<length1-1 && name.charAt(i) == name.charAt(i+1)) {
				
				count++;
				
			}
			
			else {
				
				System.out.print(name.charAt(i));
				System.out.print(count);
				
				count=1;
			}
			
		}
		
		
		
	}

}
