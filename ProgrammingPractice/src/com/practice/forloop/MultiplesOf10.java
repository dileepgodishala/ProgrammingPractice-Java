package com.practice.forloop;

public class MultiplesOf10 {
	public static void main(String[] args) {
		MultiplesOf10 mn = new MultiplesOf10();
		//mn.forMultiple(200);
		//mn.whileMultiple(200);
		mn.dowhileMultiple(200);
	}
	
	public void forMultiple(int num) {
		for(int i=1; i<=num;i++) {
			if(i%10==0) {
				System.out.println(i + " Multiple of 10");
			}
		}
	}
	
	public void whileMultiple(int num) {
		int i =1;
		while(i<=num) {
			if(i%10==0) {
				System.out.println(i + " Multiple of 10");
			}
			i++;
		}
	}
	
	public void dowhileMultiple(int num) {
		int i = 1;
		do {
			if(i%10==0) {
				System.out.println(i + " Multiple of 10");
			}
			i++;
		}while(i<=num);
	}
	
}
