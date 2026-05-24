package com.practice.forloop;

public class StopSumAt100 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=50;i++) {
			sum=sum+i;
			if(sum>100) {
				break;
			}
		}
		System.out.println(sum);

	}

}
