package com.practice.forloop;

public class SumOfMultiplesOf9 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=200;i++) {
			if(i%9==0) {
				sum =sum+i;
			}
		}
		System.out.println(sum);
	}

}
