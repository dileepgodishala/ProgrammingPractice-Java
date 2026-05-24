package com.infosys.interview;



public class ReverseWordInString {

	public static void main(String[] args) {
		//input = "My name is Poornima";
		//output = "yM eman si aminrooP";
//------------------------------------------------------//
		//convert in String array
		//loop over each word
		//print each word
		//loop on each word
		//rev each word
		//print rev words
		
		String input = "My name is Poornima";
		
		String ary[] = input.split(" ");
		for(int i = 0;i<ary.length;i++) {
			String rInp = "";
			String eachWord = ary[i];
			for(int j=eachWord.length()-1;j>=0;j--) {
				rInp = rInp + eachWord.charAt(j);
			}
			System.out.print(rInp + " ");
		}
		
	}
}
		

	


