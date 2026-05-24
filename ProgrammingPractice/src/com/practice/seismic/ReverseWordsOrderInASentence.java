package com.practice.seismic;

public class ReverseWordsOrderInASentence {

	public static void main(String[] args) {
		
		String sentence = "This is a good day";
		
		String[] arrayOfWords = sentence.split(" ");
		
//		for(String s: arrayOfWords)	System.out.println(s);
		
		int longestWordCount = 0;
		
		for(int i = arrayOfWords.length-1; i>=0; i--) {
			
			System.out.print(arrayOfWords[i]+ " ");
			
			if(arrayOfWords.length > longestWordCount)
				longestWordCount = arrayOfWords.length;
			
		}
		
		//Count number of words in the string
		System.out.println();
		System.out.println("Number of words in string: " + arrayOfWords.length);
		
		
		//Remove white spaces from string
		System.out.println("Without white spaces: " + sentence.replace(" ", ""));
		
		//Find longest word in a sentence
		System.out.println("Longest word count: " + longestWordCount);
		
	}

}
