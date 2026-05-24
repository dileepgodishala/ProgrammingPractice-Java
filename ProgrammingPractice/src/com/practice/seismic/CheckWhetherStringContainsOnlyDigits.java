package com.practice.seismic;

public class CheckWhetherStringContainsOnlyDigits {

	public static void main(String[] args) {
		
		String s = "123456789024579236487";
//		String s = "234567sdrftgyuji45678";
		
		char[] arr = s.toCharArray();
		
		boolean isCharsOnly = true;
		
		for(char c: arr) {
			
			if(c < '0' || c > '9') {
				
				isCharsOnly = false;
				
				break;
			}
			
		}
		
		if(isCharsOnly) {
			System.out.println("String only contains digits");
		}
		else {
			System.out.println("String does not only contains digits");
		}
		
		
	}

}
