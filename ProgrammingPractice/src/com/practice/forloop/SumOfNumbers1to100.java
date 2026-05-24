package com.practice.forloop;

public class SumOfNumbers1to100 {
	public static void main(String[] args) {
		SumOfNumbers1to100 sn = new SumOfNumbers1to100();
		//sn.forSum(100);
		//sn.whileSum(100);
		sn.dowhileSum(100);
	}	
	public void forSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum = sum+i;
		}
		System.out.println(sum + "is the sum");
	}
	
	public void whileSum(int num) {
		int sum = 0, i=1;
		while(i<=num) {
			sum = sum+i;
			i++;
		}
		System.out.println(sum + "is the sum");
	}
	
	public void dowhileSum(int num) {
		int i=1, sum=0;
		do {
			sum = sum + i;
			i++;
		}while(i<=num);
		System.out.println(sum);
	}
}
