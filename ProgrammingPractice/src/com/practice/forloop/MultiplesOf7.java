package com.practice.forloop;

public class MultiplesOf7 {
	public static void main(String[] args) {
		MultiplesOf7 mn = new MultiplesOf7();
		//mn.forMultiple(70);
		//mn.whileMultiple(70);
		mn.dowhileMultiple(70);
	}

	public void forMultiple(int num) {
		for(int i=1;i<=num;i++) {
			if(i%7==0) {
				System.out.println(i + " is multiple of 7");
			}
		}
	}

	public void whileMultiple(int num) {
		int i =1;
		while(i<=num) {
			if(i%7==0) {
				System.out.println(i + " is multiple of 7");	
			}
			i++;
		}
	}
	
	public void dowhileMultiple(int num) {
		int i=1;
		do {
			if(i%7==0) {
				System.out.println(i + " is Multiple of 7");
			}
			i++;
		}while(i<=num);
	}
}
