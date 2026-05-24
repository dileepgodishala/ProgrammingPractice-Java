package com.practice.forloop;

public class CountPerfrctSquares {

	public static void main(String[] args) {
	int count =0;
	for(int i=1;i<=100;i++) {
		int prod = i*i;
			if(prod == i) {
			System.out.println(i);
			count++;
		}
	}
	System.out.println(count);
	}

}
