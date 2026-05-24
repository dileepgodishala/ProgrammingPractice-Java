package com.practice.forloop;

public class PalindromeOrNot {

	public static void main(String[] args) {
		PalindromeOrNot pn = new PalindromeOrNot();
		pn.isPalindrome(252);
	}

	
	public void isPalindrome(int num) {
		int rNum=0,rem, n=252;
		while(num>0) {
			rem=num%10;
			rNum = (rNum*10) + rem;
			num = num/10;
		}
		if(n==rNum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
