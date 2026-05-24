package com.practice.seismic;

public class RemoveLeadingAndTrailingSpacesManually {

	public static void main(String[] args) {
		
        String n = "   Dileep Kumar   ";
		System.out.println(n.trim());
		
		int start = 0;
		int end = n.length()-1;
		
		while(n.charAt(start) == ' ')	start++;
		
		while(n.charAt(end) == ' ')		end--;
		
		System.out.println(n.substring(start, end+1));
		
	}

}
