package com.practice.forloop;

public class Divisible3NotBy9 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%9!=0) {
				System.out.println(i);
			}
		}
	}
}
