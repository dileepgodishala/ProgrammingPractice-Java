package com.practice.forloop;

public class VowelsInStirng {

	public static void main(String[] args) {
		int count=0;
		String word = "Poornima";
		for(int i=0;i<=word.length()-1;i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
				count++;
			}
		}
		System.out.println(count);
	}

}
