package com.practice.forloop;

import java.util.Scanner;

public class MultiplesOf5 {
	public static void main(String[] args) {
		MultiplesOf5 mn = new MultiplesOf5();
		//mn.forMultiple(50);
		//mn.whileMultiple(50);
		mn.dowhileMultiple(50);
	}
	
	public void forMultiple(int num) {
		for(int i =1;i<=num;i++) {
			if(i%5==0) {
				System.out.println(i + " is Multiple of 5");
			}
		}
	}
	
	public void whileMultiple(int num) {
		int i=1;
		while(i<=num) {
			if(i%5==0) {
				System.out.println(i + " is Multiple of 5");
			}
			i++;
		}
	}

	public void dowhileMultiple(int num) {
		int i=1;
		do {
			if(i%5==0) {
				System.out.println(i + " is Multiple of 5");
			}
			i++;
		}while(i<=num);
	}
	
}
