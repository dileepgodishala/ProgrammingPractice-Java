package com.practice.forloop;

public class OddNumbers {
	public static void main(String[] args) {
		OddNumbers on = new OddNumbers();
		//on.forOdd(10);
		//on.whileOdd(10);
		on.dowhileOdd(10);
	}
	public void forOdd(int num) {
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println(i + " is Odd Number");
			}
		}
	}
	
	public void whileOdd(int num) {
		int i=1;
		while(i<=num) {
			if(i%2!=0) {
				System.out.println(i + " is Odd Number");
			}
			i++;
		}
	}
	public void dowhileOdd(int num) {
		int i=1;
		do {
			if(i%2!=0) {
				System.out.println(i + " is Odd Number");
			}
			i++;
		}while(i<=num);
	}
}
