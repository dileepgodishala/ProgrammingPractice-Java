package com.practice.string;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String input = "TODO Auto generated method stub";
		
		//Output1 = "buts dohtem detareneg-otuA ODOT"
		//Output2 = "stub method generated-Auto TODO"
		ReverseEachWordInString rev = new ReverseEachWordInString();
		rev.invertAndReverseString(input);
		System.out.println();
		rev.invertString(input);		

	}
	
	public void invertAndReverseString(String input) {
		//convert to String array
		//loop it and get each words
		//invert the string
		//loop on the inverted string
		//reverse in words in the inverted string
		//print the reverse string
		
		String ary[] = input.split(" ");
		for(int i=ary.length-1;i>=0;i--) {
			String rWord = "";
			String eachWord = ary[i];
			for(int j=eachWord.length()-1;j>=0;j--) {
				rWord = rWord + eachWord.charAt(j);
			}
			System.out.print(rWord + " ");
		}
		
	}	
	
	public void invertString(String input) {
		
		//Convert into String array
		//loop it to get each word
		//get each word 
		//loop on each word and invert it 
		String ary[] = input.split(" ");
		for(int i=ary.length-1;i>=0;i--) {
			String eachWord = ary[i];
			System.out.print(eachWord + " ");		
		}
	}
}
