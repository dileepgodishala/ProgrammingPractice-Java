package com.practice.forloop;

public class PrintLetterNotVowels {

	public static void main(String[] args) {
		for(char alpha = 'a';alpha<='z';alpha++) {
			if(alpha == 'a' || alpha =='e' || alpha =='i' || alpha =='o' || alpha=='u') {
				continue;
			}
			System.out.print(alpha+ " ");
		}
	}

}
