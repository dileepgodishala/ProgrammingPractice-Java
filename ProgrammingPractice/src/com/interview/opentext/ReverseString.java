package com.interview.opentext;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Poornima Bandi";
		String rev = "";
		for(int i=0;i<=name.length()-1;i++) {
			rev = name.charAt(i) + rev;
		}
		System.out.println(rev);
	}

}
