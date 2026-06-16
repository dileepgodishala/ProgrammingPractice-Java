package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		String name = "aabbccdeef";
		
		char[] arr = name.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c: arr) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First non-repeating character is: " + entry.getKey());
				break;
			}
		}
		
		
		
//		System.out.println(name.length());
//		
//		for(int i=1; i<=name.length()-1; i++) {
//			
//			char currentChar = name.charAt(i);
//			
//			char nextChar = name.charAt(i+1);
//			
//			char previousChar = name.charAt(i-1);
//			
//			if(!(currentChar == nextChar || currentChar == previousChar)) {
//				System.out.println("First non repeating char: " + currentChar);
//				break;
//			}
//			
//		}
		
		
		
		

	}

}
