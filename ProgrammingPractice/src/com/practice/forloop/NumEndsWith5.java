package com.practice.forloop;

public class NumEndsWith5 {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			if(i%10==5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
