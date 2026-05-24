package com.practice.forloop;

public class CountOf1To100 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				count++;			
			}			
		}
		System.out.println(count);
	}

}
