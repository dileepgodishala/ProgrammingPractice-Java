package com.practice.forloop;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Poornima Bandi";
		String rName ="";
		for(int i=name.length()-1;i>=0;i--) {
			rName = rName+name.charAt(i);
		}
		System.out.println(rName);
	}

}
