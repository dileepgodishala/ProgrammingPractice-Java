package com.practice.forloop;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		SumOfOddNumbers so = new SumOfOddNumbers();
		//so.forSumodd(50);
		//so.whileSumodd(50);
		so.dowhileSumodd(50);
	}
	public void forSumodd(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println(sum + " is the sum of odd numbers");
	}

	
	public void whileSumodd(int num) {
		int i=1,sum=0;
		while(i<=num) {
			if(i%2!=0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum + " is the sum of odd numbers");
	}
	
	
	public void dowhileSumodd(int num) {
		int i=1, sum=0;
		do {
			if(i%2!=0) {
				sum=sum+i;
			}
			i++;
		}while(i<=num);
		System.out.println(sum + " is the sum of odd numbers");
	}
	
}
