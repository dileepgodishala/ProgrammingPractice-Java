package com.practice.seismic;

public class CheckWhetherOneStringIsRotationOfAnother {

	public static void main(String[] args) {
		
		String s1 = "abcd", s2 = "cdab";
		
		String s3 = s1 + s2;
		
		if(s1.length() == s2.length() && s3.contains(s2))	System.out.println("True");
		else	System.out.println("False");
		
	}

}
