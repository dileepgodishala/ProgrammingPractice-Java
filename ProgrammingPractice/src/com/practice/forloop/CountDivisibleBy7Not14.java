package com.practice.forloop;

public class CountDivisibleBy7Not14 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=500;i++) {
			if(i%7==0 && i%14!=0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
