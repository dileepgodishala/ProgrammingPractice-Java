package com.practice.ifelse;

public class SpecialNumber {

	public static void main(String[] args) {
		SpecialNumber sn = new SpecialNumber();
		sn.divisibleNumber(393);

	}
	public int divisibleNumber(int n) {
		String last = String.valueOf(n);
		char lastDigit = last.charAt(last.length()-1);
		if(n%11==0) {
			System.out.println("Palindrome");
		}
		else if (n%7==0) {
			System.out.println("Lucky");
		}
		else if(n%3==0 && lastDigit == 3) {
				System.out.println("Triple-Three");
		}
		else {
			boolean isFive = false;
			if(last.length()>=1  && last.charAt(0)=='5') {
				isFive = true;
			}
			else if(last.length()>=2 && last.charAt(1)=='5'){
				isFive = true;
			}
			else if(last.length()>=3 && last.charAt(2)=='5') {
				isFive = true;
			}
			else if(last.length()>=4 && last.charAt(3)=='5') {
				isFive=true;
			}
			else if(last.length()>=5 && last.charAt(4)=='5') {
				isFive=true;
			}
		}
		return n;
	}

}
