package com.practice.forloop;

public class SumOfDigitsEven {

	public static void main(String[] args) {
		int count = 0;
		for(int i=1;i<=500;i++) {
			int sum=0;
			int num=i;
			while(num>0) {
				int rem = num%10;
				sum=sum+rem;
				num=num/10;
			}
			if(sum%2==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);

	}

}
