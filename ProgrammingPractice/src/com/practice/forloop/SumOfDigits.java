package com.practice.forloop;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=9876, sum=0,rem;
		while(num>0) {
			rem=num%10;
			sum = sum +rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
