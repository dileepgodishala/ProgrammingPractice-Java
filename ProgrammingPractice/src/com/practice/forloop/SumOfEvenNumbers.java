package com.practice.forloop;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		SumOfEvenNumbers se = new SumOfEvenNumbers();
		//se.forEvensum(50);
		//se.whileSumeven(50);
		se.dowhileSumeven(50);
	}
	
	public void forEvensum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				sum = sum+i;
				
			}
		}
		System.out.println(sum + " is Sum of even Numbers");
	}
	
	
	public void whileSumeven(int num) {
		int i=1,sum=0;
		while(i<=num) {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum + " is Sum of even Numbers");
	}
	
	public void dowhileSumeven(int num) {
		int i=1,sum=0;
		do {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}while(i<=num);
		System.out.println(sum + " is Sum of even Numbers");
	}
}
