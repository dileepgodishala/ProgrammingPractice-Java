package com.practice.forloop;

public class StringPalindrome {

	public static void main(String[] args) {
		String word = "Mom";
		String rWord = "";
		for(int i=word.length()-1;i>=0;i--) {
			rWord = rWord + word.charAt(i);
			if(rWord.equalsIgnoreCase(word)) {
				System.out.println("Palindrome");
			}
		}

	}

}
