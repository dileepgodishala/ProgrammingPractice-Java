package com.practice.seismic;

import java.util.LinkedList;

public class SplitStringWithoutUsingSplit {

	public static void main(String[] args) {
		
		String s = "Split string without using split()";
		
		LinkedList<String> list = new LinkedList<>();
		
		int start = 0;
		int end =0;
		
		for(int i=0; i<s.length(); i++) {
			
			
			if(s.charAt(i) == ' ') {
				end = i;
				
				list.add(s.substring(start, end));
				
				start = i+1;
				
			}
			
		}
		

		for(String a: list)	System.out.println(a);
		
		
		
	}

}
