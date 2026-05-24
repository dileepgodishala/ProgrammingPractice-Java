package com.practice.string;

public class ReverseString {
	public static void main (String args[]) {
		ReverseString rString = new ReverseString();
		rString.revString("Java Programming");
		rString.swapString("Java Programming");
	}
	
	public void revString(String str) {
		String revString = "";
		for(int i=str.length()-1;i>=0;i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println(revString);
	}
	
	public void swapString(String str) {
		String arr[] = str.split(" ");
		for(int i =arr.length-1;i>=0;i--) {
			String eachWord = arr[i];
			System.out.print(eachWord);
			if(i>0) {
				System.out.print(" ");
			}
			
		}
		
	}

}
